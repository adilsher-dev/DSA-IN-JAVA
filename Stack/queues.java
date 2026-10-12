public class queues {
    int front,rear;
    int capacity;
    int [] q ;
    int currsize;

    public queues( int capacity){
        this.capacity = capacity;
        front = 0;
        rear=-1;
        currsize= 0;
    }

    public void enqueue(int value){
        if(currsize == capacity){
            System.out.println("Queue is Full");
        }
        rear++;
        q[rear] = value;
        currsize++;
    }
    
    public int dequeue(){
        if(rear == -1){
            System.out.println("Queue is empty");
        }
        int value = q[front];
        front++;
        currsize--;
        return value;
    }
    public int peek(){
        if(rear == -1){
            System.out.println("Empty");
            return -1;
        }
        return q[front];
    }
    public boolean isEmpty(){
        return currsize == 0;
    }
}