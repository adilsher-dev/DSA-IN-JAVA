package LinkedList;

public class Insert {

    static class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
    Node head;

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void insertAtIndex(int data,int index){
        if(head == null){
            insertAtBeginning(data);
        }
        else{
            Node temp = head;

            int count = 0;

            while(temp != null && count < index){
                temp = temp.next;
                count++;
            }

            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

        public void display(){
            Node temp = head;

            while(temp !=  null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("Null");
        }

    public static void main(String[] args) {
        Insert list = new Insert();//creating the object of that class in which the static node is present
        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(30);
        list.insertAtIndex(25,2);

        list.display();
        
    }
}
