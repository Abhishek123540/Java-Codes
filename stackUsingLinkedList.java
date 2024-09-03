import java.util.*;
public class stackUsingLinkedList {
    static class Stack{
        LinkedList<Integer> list = new LinkedList<>();
        public boolean isEmpty(){
            return list.size()==0;
        }
        public void push(int data){
            list.add(data);
        }
        public int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = list.getLast();
            list.removeLast();
            return top;
        }
        public int peek(){
            if (isEmpty()) {
                return -1;
            }
            int top = list.getLast();
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
