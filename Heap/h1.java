//using heap by the priority queue interface of java util package
import java.util.*;
class h1{
    public static void main (String args[]){
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(5);
        pq.add(7);
        pq.add(1);
        pq.add(2);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}