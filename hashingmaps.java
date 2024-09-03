import java.util.*;
public class hashingmaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        // System.out.println(map);
        // if (map.containsKey("Indonesia")) {
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }
        // System.out.println(map.get("China"));
        // System.out.println(map.get("Indonesia"));
        
        
        // int arr[] = {1,2,3,5,4};
        // for (int i : arr) {
        //     System.out.println(i);
        // }
        
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());
        }

        System.out.println();
        
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key+" "+map.get(key));
        }
        map.remove("China");
    }
}
