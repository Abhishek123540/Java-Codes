import java.util.Scanner;

public class ReplacingNameInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String st = sc.nextLine();
        String str = "Hi! <name> welcome to Java";
        str = str.replace("<name>",st);
        System.out.println(str);
    }
}
