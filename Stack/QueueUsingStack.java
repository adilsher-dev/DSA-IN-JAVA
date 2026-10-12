import java.util.*;
public class QueueUsingStack {
    Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();

    void enqueue(int x){
        s1.push(x);
    }

    int dequeue(){

        if(s1.isEmpty() && s2.isEmpty()){
            return -1;
        }

        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    int peek(){
        if(s1.isEmpty() && s2.isEmpty()){
            return -1;
        }

        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        return s2.peek();

    }

    boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String [] args){

        QueueUsingStack q = new QueueUsingStack();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front: " + q.peek());

        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());

        System.out.println("Front: " + q.peek());
    }
    
}
