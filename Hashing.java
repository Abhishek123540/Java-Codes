import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(5);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(1);

        // if (set.contains(1)) {
        //     System.out.println("set has 1");
        // }
        // if (!set.contains(6)) {
        //     System.out.println("set has no 6");
        // }
        // set.remove(1);
        // if (!set.contains(1)) {
        //     System.out.println("Does not have 1");
        // }
        // System.out.println(set.size());

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
