public class firstocurr{
      public static int first(int arr[],int target){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target){
                    return i;
                }
            }
            return -1;

      }
      public static void main(String[]args){
        int arr[]={34,11,43,11,33,11,66};
        int target=11;
        System.out.println(first(arr,target));
      }
}
