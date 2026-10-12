import java.util.*;

public class StackUsingQueue {
    Queue<Integer> q = new LinkedList<>();

    void push(int x){
        q.add(x);

        int n = q.size();

        for(int i = 0; i < n -1;i++){//this will reverse the numbers in order
            q.add(q.remove());
        }
    }

    int pop(){
        if(q.isEmpty()){
            return -1;
        }

        return q.remove();
    }

    int top(){
        return q.peek();
    }

    boolean isEmpty(){
        return q.isEmpty();
    }

    public static void main(String [] args){

        StackUsingQueue s = new StackUsingQueue();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top: " + s.top());
        System.out.println("Pop: " + s.pop());
        System.out.println("Pop: " + s.pop());
        System.out.println("Top: " + s.top());

    }
    
}
