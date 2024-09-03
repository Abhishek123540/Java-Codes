import java.util.*;
class arlist{
    public static void main(String[] args) {
        
        //Declaration of array
        int z[]=new int[10];
        int n = z.length;

        String sl="Abcdef";
        int x=sl.length();
        n=x;x=n;



        
        //Declaration of Array lists
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //Adding elements into an Array list
        list.add(0);
        list.add(1);
        list.add(2);
        
        //Printing an Array list
        System.out.println(list);
        
        //Get elements
        int element=list.get(0);
        System.out.println(element);
        
        //To add element in between
        list.add(1,4);
        System.out.println(list);

        //Set element -> change already added element in a list
        list.set(0,5);
        System.out.println(list);

        //Delete element
        list.remove(3);
        System.err.println(list);

        //Determine the size of array list
        int size = list.size();
        System.out.println(size);

        //loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //sorting in arraylists
        Collections.sort(list);
        System.out.println(list);
    }
}
