import java.util.*;

public class reccFibonacciArList {
    void fibo(ArrayList<Integer> n){
        for (int j = 0; j < n.size(); j++) {
            int a=0,b=1,c;
            System.out.print("0 ");
            System.out.print("1 ");
            for (int i = 2; i < n.get(j) ; i++) {
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        ArrayList<Integer> n = new ArrayList<>();
        System.out.println("Enter the length of array");
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println("Enter the element");
            int r = sc.nextInt();
            n.add(r);
        }
        reccFibonacciArList ob = new reccFibonacciArList();
        ob.fibo(n);
    }
}
