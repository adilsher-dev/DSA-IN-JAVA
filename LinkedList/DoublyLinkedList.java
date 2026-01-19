package LinkedList;

public class DoublyLinkedList {

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;
    Node tail;

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void insertAtIndex(int data,int index){
        Node newNode = new Node(data);


        if(index == 0){
            insertAtBeginning(data);
            return;
        }

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        int count = 0;
        Node temp = head;

        while(temp != null && count < index - 1){
            temp = temp.next;
            count++;
        }

        if(temp == null || temp.next == null){
            insertAtEnd(data);
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;

    }


    public void deleteAtBeginning(){
        if (head == null) {
        return;
    }

    // Case 2: only one node
    if (head.next == null) {
        head = null;
        tail = null;
        return;
    }

    // Case 3: more than one node
    head = head.next;
    head.prev = null;
}


    public void deleteAtEnd(){
        if (head == null) {
        return;
    }

    // Case 2: only one node
    if (head.next == null) {
        head = null;
        tail = null;
        return;
    }

    // Case 3: more than one node
    tail = tail.prev;
    tail.next = null;
}



    public void deleteAtIndex(int index){


    // Case 1: empty list
    if (head == null) {
        return;
    }

    // Case 2: delete at beginning
    if (index == 0) {
        deleteAtBeginning();
        return;
    }

    Node temp = head;
    int count = 0;

    // Move to the node at index
    while (temp != null && count < index) {
        temp = temp.next;
        count++;
    }

    // Index out of bounds
    if (temp == null) {
        return;
    }

    // Case 3: delete at end
    if (temp.next == null) {
        deleteAtEnd();
        return;
    }

    // Case 4: delete in middle
    temp.prev.next = temp.next;
    temp.next.prev = temp.prev;


    }
    

    public void display(){

    }


    public static void main(String[] args) {
        
        
    }
    
}
