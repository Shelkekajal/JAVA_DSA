// public class bubblesort{
//     public static void search(int number[]){
//         for(int i=0;i<number.length-1;i++){
//             for(int j=0;j<number.length-1-i;j++){
//                 if(number[j]>number[j+1]){
//                     int temp=number[j];
//                     number[j]=number[j+1];
//                     number[j+1]=temp;
//                 }
//             }
//         } 
        
//     }
//     public static void printArray(int number[]){
//         for(int i=0;i<number.length;i++){
//             System.out.print(number[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//             int number[]={5,4,1,3,2};
//             search(number);
//             printArray(number);
//     }
// }
import java.util.*;
public class bubblesort{
    public static void main(String args[]){
        int number[]={8,4,9,3,1,5,3};
        Arrays.sort(number,0,number.length);
        
        System.out.print(Arrays.toString(number));
    }
}