//queue using java collections framework
import java.util.*;
class q2{
    public static void main(String args[]){
        Queue<Integer> s= new LinkedList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        while(!s.isEmpty()){
            //System.out.println(s.peek());
            System.out.println(s.remove());
        }
    }
}