

#include <iostream>
#include <string>
using namespace std;

// int -> string
string itos(int x) {
    if (x == 0) return "0";
    bool neg = x < 0;
    if (neg) x = -x;
    string r = "";
    while (x > 0) { r = char('0' + x % 10) + r; x /= 10; }
    return neg ? "-" + r : r;
}

const int MAXN = 10;
const int NONE = -2;   // "not blocked"
const int ROOM = -1;   // id used for the room semaphore


struct Semaphore {//khudka semaphore banaya hai
    int value;//1 fork is free and 0 oar fork is being used
    int q[MAXN];   // blocked philosophers
    int cnt;       // number of philosophers in queue
};

void initSem(Semaphore &s, int v) { s.value = v; s.cnt = 0; }

enum State { THINKING, HUNGRY, EATING, DONE };
const char *STATE_NAME[] = {"THINKING", "HUNGRY", "EATING", "DONE"};

int N, MEALS;
Semaphore fork_[MAXN];//har fork ka khudka semaphore hona chaiye
Semaphore room;

State st[MAXN];       // state of each philosopher
int pc[MAXN];         // program counter (which step runs next)
int blockedOn[MAXN];  // NONE, ROOM or fork index it is blocked on
int eatLeft[MAXN];    // rounds of eating still to do
int mealsLeft[MAXN];
int owner[MAXN];      // owner[f] = philosopher holding fork f, -1 = free

int stepNo = 0, roundNo = 0;

void printQueue(const char *name, Semaphore &s) {
    cout << " " << name << " queue: [";
    for (int i = 0; i < s.cnt; i++) cout << (i ? " " : "") << "P" << s.q[i] + 1;
    cout << "]";
}

void snapshot() {//ye current condition kya hogi table ki ye batayega
    cout << "      Table      : ";
    for (int i = 0; i < N; i++) {
        cout << "P" << i + 1 << "[" << STATE_NAME[st[i]];
        if (blockedOn[i] == ROOM) cout << ", blocked on room";
        else if (blockedOn[i] >= 0) cout << ", blocked on fork[" << blockedOn[i] + 1 << "]";//blockedOn[P3] = 1 ->P3 is waiting for fork 2 bcz arrr indexing starts form index 0 
        cout << "] -F" << i + 1 << "(";
        if (owner[i] < 0) cout << "free"; else cout << "P" << owner[i] + 1;
        cout << ")- ";
    }
    cout << "(back to P1)\n";
    cout << "      Semaphores : ";
    for (int i = 0; i < N; i++) cout << "fork[" << i + 1 << "]=" << fork_[i].value << "  ";
    cout << "room=" << room.value << "\n";
    bool any = (room.cnt > 0);
    for (int i = 0; i < N; i++) if (fork_[i].cnt > 0) any = true;
    if (any) {
        cout << "      Blocked    :";
        if (room.cnt > 0) printQueue("room", room);//If philosophers are waiting for room, print their queue.
        for (int i = 0; i < N; i++) {
            if (fork_[i].cnt > 0) {
                string nm = "fork[" + itos(i + 1) + "]";
                printQueue(nm.c_str(), fork_[i]);
            }
        }
        cout << "\n";
    }
    cout << "\n";
}

void say(int id, const string &msg) {//Prints what a philosopher is doing.
    cout << "[Step " << ++stepNo << "] P" << id + 1 << ": " << msg << "\n";
}

// A philosopher receives semaphore `semId` (directly or after being woken)
void grant(int semId, int id) {//"The philosopher has successfully received the semaphore."
    blockedOn[id] = NONE;
    if (semId >= 0) owner[semId] = id;
}

Semaphore &semOf(int semId) { return semId == ROOM ? room : fork_[semId]; }////"Which semaphore are we talking about?"

string semName(int semId) {//Converts semaphore ID into a readable name.
    return semId == ROOM ? string("room") : "fork[" + itos(semId + 1) + "]";
}

// wait(S)
void waitSem(int semId, int id) {//semId = which semaphore?
//id = which philosopher?
    Semaphore &s = semOf(semId);
    if (s.value > 0) {
        int before = s.value;
        s.value--;
        grant(semId, id);
        say(id, "wait(" + semName(semId) + "): " + itos(before) + " -> " +
                itos(s.value) + "  (acquired, continues)");
    } else {
        s.q[s.cnt++] = id;
        blockedOn[id] = semId;
        say(id, "wait(" + semName(semId) + "): value is 0 -> BLOCKED, added to " +
                semName(semId) + " queue");
    }
}

// signal(S)
void signalSem(int semId, int id) {//this tells us i m releasing it resource
    Semaphore &s = semOf(semId);
    if (semId >= 0) owner[semId] = -1;   // fork put back on the table
    if (s.cnt > 0) {//if something is waiting //usko fork dedo
        int w = s.q[0];
        for (int i = 1; i < s.cnt; i++) s.q[i - 1] = s.q[i];
        s.cnt--;
        grant(semId, w);                 // woken philosopher gets it directly
        say(id, "signal(" + semName(semId) + "): queue not empty -> WAKE P" +
                itos(w + 1) + ", value stays " + itos(s.value));
    } else {
        int before = s.value;
        s.value++;
        say(id, "signal(" + semName(semId) + "): " + itos(before) + " -> " +
                itos(s.value));
    }
}


void step(int id) {//It performs one small action of one philosopher.
    int left = id, right = (id + 1) % N;
    switch (pc[id]) {
        case 0:
            st[id] = THINKING;
            say(id, "is THINKING (meal " + itos(MEALS - mealsLeft[id] + 1) + "/" +
                    itos(MEALS) + ")");
            pc[id] = 1; break;
        case 1:
            st[id] = HUNGRY;
            say(id, "is HUNGRY, needs Fork " + itos(left + 1) + " (left) and Fork " +
                    itos(right + 1) + " (right)");
            pc[id] = 2; break;
        case 2: pc[id] = 3; waitSem(ROOM, id); break;
        case 3: pc[id] = 4; waitSem(left, id); break;
        case 4: pc[id] = 5; waitSem(right, id); break;
        case 5:
            st[id] = EATING;
            eatLeft[id] = 2;
            say(id, "holds Fork " + itos(left + 1) + " and Fork " + itos(right + 1) +
                    " -> starts EATING");
            pc[id] = 6; break;
        case 6:
            if (eatLeft[id] > 0) {
                eatLeft[id]--;
                say(id, "is still EATING");
            } else {
                st[id] = THINKING;
                say(id, "finished eating, puts down the forks");
                pc[id] = 7;
            }
            break;
        case 7: pc[id] = 8; signalSem(right, id); break;
        case 8: pc[id] = 9; signalSem(left, id); break;
        case 9:
            pc[id] = 0;
            signalSem(ROOM, id);
            mealsLeft[id]--;
            if (mealsLeft[id] == 0) st[id] = DONE;
            break;
    }
}

int main() {
    cout << "Enter number of philosophers (2 to " << MAXN << "): ";
    cin >> N;
    if (!cin || N < 2 || N > MAXN) {
        cout << "Invalid input: need 2 to " << MAXN << " philosophers.\n";
        return 1;
    }
    cout << "Enter number of times each philosopher eats: ";
    cin >> MEALS;
    if (!cin || MEALS < 1) { cout << "Invalid input.\n"; return 1; }

    for (int i = 0; i < N; i++) {
        initSem(fork_[i], 1);
        st[i] = THINKING; pc[i] = 0; blockedOn[i] = NONE;
        eatLeft[i] = 0; mealsLeft[i] = MEALS; owner[i] = -1;
    }
    initSem(room, N - 1);

    cout << "\n=========== DINING PHILOSOPHERS (Semaphore solution) ===========\n";
    cout << "Philosophers : " << N << "   Meals each : " << MEALS << "\n";
    cout << "Forks        : " << N << " (one between each pair of neighbours)\n";
    cout << "Seating      : ";
    for (int i = 0; i < N; i++) cout << "P" << i + 1 << " -F" << i + 1 << "- ";
    cout << "(circular)\n";
    cout << "Rule         : P(i) uses Fork i (left) and Fork i+1 (right); Fork " << N + 1 << " = Fork 1\n\n";
    cout << "Semaphores   : fork[1.." << N << "] = 1 (binary: 1 = free, 0 = in use)\n";
    cout << "               room = " << N - 1 << " (counting: at most N-1 may grab forks -> no deadlock)\n\n";
    cout << "Initial state:\n";
    snapshot();
    cout << "------------------------- SIMULATION -------------------------\n";

    while (true) {
        bool allDone = true, progress = false;
        for (int i = 0; i < N; i++) if (st[i] != DONE) allDone = false;
        if (allDone) break;

        roundNo++;
        cout << "\n======== ROUND " << roundNo << " ========\n\n";
        for (int i = 0; i < N; i++) {
            if (st[i] == DONE || blockedOn[i] != NONE) continue;  // skip finished / blocked
            step(i);
            progress = true;
            snapshot();
        }
        if (!progress) {
            cout << "DEADLOCK: every remaining philosopher is blocked!\n";
            return 1;
        }
    }

    cout << "------------------------- FINAL STATE -------------------------\n";
    snapshot();
    cout << "All philosophers have finished eating (" << stepNo << " steps, " << roundNo << " rounds). No deadlock.\n";
    cout << "Check: every fork[i] is back to 1 and room is back to " << N - 1 << ".\n";
    return 0;
}
