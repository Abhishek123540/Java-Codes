import java.util.*;

public class NoOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        int w=0;
        str = " "+str;
        for (int i = 0; i < (str.length())-1; i++) {
            char ch = str.charAt(i);
            if(ch == ' ')
                if (str.charAt(i+1)!=' ') 
                    w++;
        }
        System.out.println("Number of words is equal to = "+w);
    }
}
