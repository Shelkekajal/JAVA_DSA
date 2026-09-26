//java collection framework of linkedlist which consist of inbuilt function so as we have develop linked list from
//scrach in previous l1.java but there direct inbulid method get used 

import java.util.LinkedList;
public class l4{
    public static void main(String args[]){
        //create
        LinkedList<Integer>obj=new LinkedList<>();
        //add
        obj.addFirst(5);
        obj.addFirst(4);
        obj.addFirst(3);
        obj.addFirst(2);
        obj.addFirst(1);
        obj.addLast(6);
        obj.addLast(7);

        System.out.println(obj);

        //remove
        obj.removeLast();
        obj.removeFirst();
         System.out.println(obj);

    }
}
