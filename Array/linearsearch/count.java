// public class count{
//       public static int countocurr(int arr[],int target){
//         int count=0;
//             for(int i=0;i<arr.length;i++){
//                 if(arr[i]==target){
//                     count++;
                   
//                 }
//             }
//             return count;

//       }

//       public static void main(String[]args){
//         int arr[]={34,11,43,11,33,11,66};
//         int target=11;
//         System.out.println(countocurr(arr,target));
//         }}



//         //all countnumber
        public class count{
      public static int countocurr(int arr[]){
        int count=0;
            for(int i=0;i<arr.length;i++){
                
                    count++;
                   
                
            }
            return count;

      }
      public static void main(String[]args){
        int arr[]={34,11,43,11,33,11,66};
        
        System.out.println(countocurr(arr));
        }}