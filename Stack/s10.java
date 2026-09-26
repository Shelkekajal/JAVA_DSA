//next greater element check in right of element and compare it 
import java.util.*;
class s10{
 public static void main(String args[]){
            int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nxtGeater[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&  s.peek()<=arr[i]){
                s.pop();
            }
                if(s.isEmpty()){
                    nxtGeater[i]=-1;
                }else{
                    nxtGeater[i]=s.peek();
                }
                s.push(arr[i]);
            }
            for(int i=0;i<nxtGeater.length;i++){
                System.out.print(nxtGeater[i]+" ");
            
            }

        }
 }

//related questions:1)next greater element in left of element
//2)next greater element in right of element
//next smaller element in left of element
//next smaller element in right of element
