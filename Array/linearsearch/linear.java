// public class linear{
//     public static int linearSearch(int numbers[],int target){
//         for(int i=0;i<numbers.length;i++){
//               if(numbers[i]==target){
//                 return i;
//               }
//         }
//                 return -1;
//     }
        

//     public static void main(String args[]){
//             int numbers[]={10, 20, 30, 40, 50}; // Initializing array with numbers
//             int target=40; // Element to search for
            
//             System.out.println(linearSearch(numbers, target));
//             // if(result!=-1){
//             //     System.out.println("number found is "+target);
//             // } else {
//             // 	System.out.println("number not found");
//             // }
            
//             }
    
// }
import java.util.*;
public class linear{
    public static int linearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
              if(arr[i]==target){
                return i;
              }
        }
                return -1;
    }
        

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
  for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
    
  }
  int target=sc.nextInt();

          System.out.println(linearSearch(arr, target));
           
            }
    
}



// find largest in array
// import java.util.*;
// public class linear{
//     public static int linearSearch(int number[],int largest){
//         for(int i=0;i<number.length;i++){
//             if(number[i]>largest){
//                 largest=number[i]; // Update largest if current number is greater
                
//             }
//         }
//               return largest; // Return the largest number found
//         }

//      public static int linearSearch2(int number[],int smallest){
//         for(int i=0;i<number.length;i++){
//             if(number[i]<smallest){
//                 smallest=number[i]; // Update smallest if current number is smaller
                
//             }
//         }
//               return smallest; // Return the smallest number found
//         }
//     public static void main(String args[]){
//         int number[]={23,45,67,23,69};
//         int largest=Integer.MIN_VALUE; // Initialize largest to the smallest possible integer
//         int smallest=Integer.MAX_VALUE; // Initialize smallest to the largest possible integer
//         int result=linearSearch(number,largest);
//         int result2=linearSearch2(number,smallest); // Call linearSearch to find the smallest number
          
//         System.out.println("Largest number is: " + result); // Print the largest number found
//         System.out.println("Smallest number is: " + result2); // Print the smallest number found
// }
// }