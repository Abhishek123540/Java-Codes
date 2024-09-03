import java.util.*;
public class ReccFactArrList {
    public int factor(int n){
        if (n<=1){
            return 1;
        }
        else{
            return n*factor(n-1);
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       ReccFactArrList ob = new ReccFactArrList();
       ArrayList<Integer> arr = new ArrayList<>();
       int n=1;
       while(n>0){
            n= sc.nextInt();
            if (n>0) {
                arr.add(ob.factor(n));
            }
       }
       for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
       }
    }
}
/*
public class ReccFactArrList {
    public int factor(int n){
        if (n<=1){
            return 1;
        }
        else{
            return n*factor(n-1);
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int x = sc.nextInt();
       ReccFactArrList obj = new ReccFactArrList();
       int result = obj.factor(x);
       System.out.println(result);
    }
}
*/

/*
public class ReccFactArrList {

    public int fact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        sc.close(); // Close the scanner to prevent resource leaks
        ReccFactArrList obj = new ReccFactArrList();
        int result = obj.fact(x);
        System.out.println("Factorial of " + x + " is " + result);
    }
}
*/

/*
public class ReccFactArrList {

    static int fact(int n){
        if (n==0){
            return 1;
        }
        return (n*fact(n-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac=fact(n);
        System.out.println(fac);
    }
}
*/
