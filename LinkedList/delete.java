package LinkedList;

public class delete {
    static class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
    Node head;

    public void deleteAtStart(){
        if(head == null){
            System.out.println("Linkedist is Empty");
            return;
        }

        head = head.next;
    }

    public void deleteAtEnd(){

        if(head == null){
            System.out.println("Linkedlist is Empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtIndex(int index){
        if(head == null){
            System.out.println("Linkedlist is Empty");
        }

        if(index == 0){
            head = head.next;
        }

        Node temp = head;
        int count = 0;

        while(temp != null && count < index - 1){
            temp =  temp.next;
            count++;
        }

        if(temp.next == null){
            return;
        }

        temp.next = temp.next.next;


    }

    public static void main(String[] args) {
        
    }

    
}
