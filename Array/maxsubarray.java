// //by brute force method 
// public class maxsubarray{
//     public static void maxSubarraysum(int number[]){
//         int curr=0;
//         int max=Integer.MIN_VALUE;

//         for(int i=0;i<number.length;i++){
//             int start=i;
//         for(int j=i;j<number.length;j++){
//             int end =j;
//             curr=0; // reset curr for each new subarray
//             // calculate the sum of the subarray from start to end
//             for(int k=start;k<=end;k++){
//                 curr=curr+number[k];
                
//             }
//             System.out.println(curr);
//             if(curr>max){
//                 max=curr;
//             }
//         }

//         }
//         System.out.println("Max sum is "+max);
//     }
//     public static void main(String args[]){
//         int number[]={1,2,3,4,5};
//         maxSubarraysum(number);

//     }
// }



// //maxsubarray by prefix sum (maximum subarray sum problem)

// public class maxsubarray{
//     public static void maxSubarraysum(int number[]){
//         int curr=0;
//         int maxSum=Integer.MIN_VALUE;
//         int prefix[]=new int [number.length];

//         prefix[0]=number[0];
//      //calculate prefix sum
//        for(int i=1;i<number.length;i++){
//         prefix[i]=prefix[i-1]+number[i];
//        }
//           for(int i=0;i<number.length;i++){
//             int start=i;
//             for(int j=i;j<number.length;j++){
//                 int end=j;
//                  curr=start==0 ? prefix[end]:prefix[end]-prefix[start-1];
//                 if(curr>maxSum){
//                     maxSum=curr;
//                 }
//             }
//         }
//        System.out.print("Max  sum is "+maxSum);
//     }
//     public static void main(String args[]){
//         int number[]={1,2,3,4,5,6};
//         maxSubarraysum(number);

//     }
// }


//maxsubarray by kadane's algorithm for both positive and negative numbers
public class MaxSubarray {

    public static int maxSubarraySum(int number[]) {

        int current = number[0];
        int maxSum = number[0];

        for (int i = 1; i < number.length; i++) {

            current = Math.max(number[i], current + number[i]);

            maxSum = Math.max(maxSum, current);
        }

        return maxSum;
    }

    public static void main(String args[]) {

        int number[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Maximum subarray sum = "
                + maxSubarraySum(number));
    }
}
