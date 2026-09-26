public class min{
      public static int minnn(int arr[]){
        int min=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                   
                }
            }
            return min;

      }
      public static void main(String[]args){
        int arr[]={34,11,43,11,33,11,66};
        
        System.out.println(minnn(arr));
        }}