//finding the max and min number in an array
//  Time complexity=o(1)
import java.util.*;
public class Q4{
     public static void main(String[] args) {
      int[] arr={1,2,33,5,7,9,2,6};
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
      int small=arr[0];
      int large=arr[arr.length-1];
      //finding second largest elemnet in array
      int secondLarge=arr[arr.length-2];
      System.out.println("Smallest number is: "+small);
      System.out.println("Largest number is: "+large);
      System.out.println("Second largest number is: "+secondLarge);
       
    }
}