import java.util.*;
public class LListScratch {
    Node head;
    private int size;
    LListScratch(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data){
        size++;
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
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
    public void addIndex(String data,int n){
        size++;
        Node newNode = new Node(data);
        if (head==null) {
            head=newNode;
            return;
        }
        if (n==0) {
            newNode.next=head;
            head=newNode;
            return;
        }
        Node node = head;
        for (int i = 0; i < n-1; i++) {
            node=node.next;
        }
        newNode.next = node.next;
        node.next = newNode;
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
    public void deleteIndex(int n){
        if(head==null){
            System.out.println("Wrong position");
            return;
        }
        if (head.next==null) {
            if (n==0) {
                size--;
                head=null;
                return;
            }
            System.out.println("Wrong position");
            return;
        }
        size--;
        if (n==0) {
            head=head.next;
            return;
        }
        Node n1=head,n2=head.next;
        for (int i = 0; i < n-1; i++) {
            n1=n2;
            n2=n2.next;
        }
        n1.next=n2.next;
    }

    public void printList(){
        if (head==null) {
            System.out.println("Empty");
            return;
        }
        Node node = head;
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LListScratch list = new LListScratch();
        String str="";
        int ch=0;
        int n;
        while (ch!=9) {
            System.out.println("Choices:");
            System.out.println("1. Add First\n2. Add Last\n3. Add at index\n4. Delete First\n5. Delete Last\n6. Delete at index\n7. Print List\n8. Print Size of the list\n9. Exit");
            System.out.print("Enter your choice: ");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter your String");
                    str=sc.next();
                    list.addFirst(str);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter your String");
                    str=sc.next();
                    list.addLast(str);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter your string and position index");
                    str=sc.next();
                    n=sc.nextInt();
                    list.addIndex(str, n);
                    System.out.println();
                    break;
                case 4:
                    list.deleteFirst();
                    System.out.println();
                    break;
                case 5:
                    list.deleteLast();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Enter the position index to delete");
                    n=sc.nextInt();
                    list.deleteIndex(n);
                    System.out.println();
                    break;
                case 7:
                    list.printList();
                    break;
                case 8:
                    System.out.println(list.size);
                    System.out.println();
                    break;
                default:
                    break;
            }
        }
    }
}
