public class Factorial {

    public int calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int result = factorial.calculateFactorial(5);
        System.out.println("The factorial of 5 is: " + result);
    }
}
