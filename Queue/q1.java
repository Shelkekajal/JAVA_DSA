//Queue using array 
import java.util.*;
class q1{
    public  static class queue{
          int arr[];
          int size;
          int rear;

         queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
         }
         public boolean isEmpty(){
            return rear==-1; 
         }
         //add
         public void add(int data){
            if(rear==size-1){
               System.out.println("queue is full");
               return ;
            }
            rear=rear+1;
            arr[rear]=data;

         }
         //remove
         public  int remove(){
            if(isEmpty()){
              System.out.println("queue is empty");
              return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
             rear=rear-1;
             return front;
                
         }
             //peek
             public int peek(){
                if(isEmpty()){
                    System.out.println("queue is empty");
                    return -1;
                }
                return arr[0];
             }
         }
    
    public static void main(String args[]){
        queue s=new queue(5);
        s.add(1);
        s.add(2);
        s.add(3);
        while(!s.isEmpty()){
            System.out.print(s.remove()+" ");
           // s.remove();
        }

    }
}