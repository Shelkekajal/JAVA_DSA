//reverse the array by using two pointer appproch
import java.util.*;
class Q5{
    public static void main(String[] args){
        int[] arr = {1, 2, 13, 4, 5, 6, 7, 8, 9, 10};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp= arr[left];
             arr[left]= arr[right];
             arr[right]= temp;
        
        left++;
        right--;

        }
      
         System.out.println(Arrays.toString(arr));
     

    }
   
   
}