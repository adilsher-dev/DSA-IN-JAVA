public class stacks_queues {
    //initialiation
    int[] st;
    int top;
    int capacity;

    //declaration
    public stacks_queues(int size) {
        st = new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int value){
        if(top == capacity - 1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        st[top] = value;
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Undeflow");
            return -1;
        }
        return st[top--];

    }
    public int top() {
        if( top == -1 ){
            return -1;
        }
        return st[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public int size(){
        return top + 1;
    }

    public static void main(String[] args) {
        //implement stack using array
        stacks_queues st = new stacks_queues(5);
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("peek element"+st.top());
        System.out.println("popped"+st.pop());
        System.out.println("size"+st.size());

    }
}
