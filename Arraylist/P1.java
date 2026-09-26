// methods in arraylist use such as add,set,get,remove,contains,

import java.util.ArrayList;
public class P1{
    public static void main(String args[]){
      ArrayList<Integer> list=new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
System.out.println(list);

      list.add(5,7);
System.out.println(list);

      int element=list.get(4);
System.out.println(element);

      list.set(0,0);
System.out.println(list);


      list.remove(5);
System.out.println(list);

System.out.println(list.contains(4));
System.out.println(list.contains(89));

//size of Arraylist
for(int i=0;i<list.size();i++){
    System.out.print(list.get(i)+" ");
}
    }
}