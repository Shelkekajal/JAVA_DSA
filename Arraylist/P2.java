//print reverse
import java.util.ArrayList;
public class P2{
    public static void main(String args[]){
       
ArrayList<Integer> list=new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       //System.out.print(list.get(3)+" ");
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
//print maximum element
        int max=Integer.MIN_VALUE;
       for(int i=0;i<list.size();i++){
    //    if(list.get(i)>max){
    //        max=list.get(i);
    //    }
       max=Math.max(max, list.get(i));
       }
       System.out.println("Maximum element is "+max);

//print minimum element

int min=Integer.MAX_VALUE;
       for(int i=0;i<list.size();i++){
       if(list.get(i)<min){
           min=list.get(i);
       }

       }
       System.out.println("Maximum element is "+min);
    }
}