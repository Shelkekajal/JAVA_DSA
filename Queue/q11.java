//Implement the Stack using Deque
import java.util.*;
class q11{
    Deque<Integer> deque=new LinkedList<>();
    public void push(int data){
        deque.addLast(data);
    }
    public int pop(){
        return deque.removeLast();
    }
    public int peek(){
        return deque.getLast();
    }

    public static void main(String args[]){
      Stack<Integer> stack = new Stack<>();
      
    }
}