import java.util.*;

public class BinaryAndDecimal {
    long BinToDec(long n){
        long sum=0,i=0;
        while(n!=0){
            long d = n%10;
            sum += (long) (Math.pow(2,i++)*d);
            n/=10;
        }
        return sum;
    }
    long DecToBin(long n){
        long sum=0;
        long i=0;
        while(n!=0){
            long d = n%2;
            sum += (long) (d*Math.pow(10,i++));
            n/=2;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        BinaryAndDecimal ob = new BinaryAndDecimal();
        System.out.println("Enter your choice");
        System.out.println("1. Decimal To Binary");
        System.out.println("2. Binary To Decimal");
        int ch=sc.nextInt();
        switch (ch) {
            case 1 -> {
                System.out.println("Enter a Decimal Number");
                long a = sc.nextLong();
                System.out.println(ob.DecToBin(a));
            }
            case 2 -> {            
                System.out.println("Enter a Binary Number");
                long b = sc.nextLong();
                System.out.println(ob.BinToDec(b));
            }
            default -> System.out.println("Not a good choice fuck off!");
        }
    }
}
