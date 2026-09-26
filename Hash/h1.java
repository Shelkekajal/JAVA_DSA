
import java.util.*;
public class h1{
    public static void main(String args[]){
        HashSet<Integer>set=new HashSet<>();
         //Add the element
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(4);
        set.add(5);
        System.out.println("Adding elements: "+set);
        
        //check the size
        System.out.println("Size of set: "+ set.size());
        //check if element exists or not
        System.out.println("Contains 3: "+set.contains(3));
        System.out.println("Contains 6: "+set.contains(6));
        //remove the element
        set.remove(3);
        System.out.println("Removing 3: "+set);

        //iterate using for each loop
        System.out.println("Iterating with for-each:");
        for(int i:set){
            System.out.println(i+" ");
        }

        //iterate using iterator
        System.out.println("Iterating with iterator:");
     Iterator<Integer> it=set.iterator();
     while(it.hasNext()){
        System.out.println(it.next());
     }
     //add the element to another set
     HashSet<Integer>set2=new HashSet<>();
     set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        System.out.println("set2: "+set2);
        set.addAll(set2);
        System.out.println("set: "+set);

        
        System.out.println();
        //clear the set
        set.clear();
        System.out.println("set: "+set);
        System.out.println(set.isEmpty());
    }    
}