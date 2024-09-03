import java.util.*;
public class reverseLinklist {
    Node head;
    private int size;
    reverseLinklist(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        size++;
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next=newNode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        size--;
        if (head.next==null) {
            head=null;
            return;
        }
        Node n1=head,n2=head.next;
        while (n2.next!=null) {
            n1=n2;
            n2=n2.next;
        }
        n1.next=null;
    }

    public void printList(){
        if (head==null) {
            System.out.println("Empty");
            return;
        }
        Node node = head;
        while(node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
    public int getSize(){
        return size;
    }
    //reverse linklist
    public void reverseIterate(){
        if (head==null || head.next==null) {
            return;
        }
        
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode!=null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = currNode;
        head = prevNode;
    }
    public Node reverseRecursive(Node head){
        if (head==null || head.next==null) {
            return head;
        }
        Node newHead=reverseRecursive(head.next);
        head.next.next = head;
        head.next=null;
        return newHead;
    }

    public static void main(String[] args) {
        reverseLinklist list = new reverseLinklist();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();
        
        list.head=list.reverseRecursive(list.head);
        list.printList();
    }
}
