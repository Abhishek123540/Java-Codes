import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = "Hello " + str;
        str = str.toUpperCase();
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 65; j < 90; j++) {
                for (long k = 0; k < 100000000; k++) {
                    //for (long k2 = 0; k2 < 1000000; k2++) {
                    // for (long l = 0; l < 1000000000; l++) {
                    int a = 5;
                    int b = a;
                    int c = b;
                    int d = c;
                    if (a == b && c == d && b == c) {
                        a = d;
                        // }
                        //  }
                    }
                }
                char chr = (char) j;
                System.out.println(str1 + chr);
                if (ch == chr) {
                    break;
                }
            }
            str1 = str1 + ch;
            System.out.println(str1);
        }
    }
}
