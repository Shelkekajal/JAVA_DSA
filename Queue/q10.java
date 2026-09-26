//Deque(Double ended queue) function addFirst(),addLast(),removeFirst(),removeLast(),getFirst(),getLast()
import java.util.*;
public class q10{
    public static void main(String args[]){
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
         System.out.println("First element "+deque.getFirst());
         System.out.println("Last element "+deque.getLast());
    }
}