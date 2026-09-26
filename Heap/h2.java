//priority queue for object
import java.util.*;
public class h2{
public static class student implements Comparable<student>{
    String name; 
    int rank;
    public student(String name,int rank){
        this.name=name;
        this.rank=rank;
    }
    // @Override
    // public int compareTo(student s2){
    //     return this.rank-s2.rank;//ascending order
    // }
   @Override
public int compareTo(student s2){
    return this.name.compareTo(s2.name); // alphabetical order
}

}
public static void main(String args[]){
    PriorityQueue<student>pq=new PriorityQueue<>();
    pq.add(new student("A",3));
    pq.add(new student("B",1));
    pq.add(new student("C",4));
    pq.add(new student("D",2));
    while(!pq.isEmpty()){
        System.out.println(pq.peek().name+ "->" +pq.peek().rank);
        pq.remove();
    }
}
}