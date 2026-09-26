public class lastocurr{
      public static int last(int arr[],int target){
        int index=-1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target){
                    index=i;
                }
            }
            return index;

      }
      public static void main(String[]args){
        int arr[]={34,11,43,11,33,11,66};
        int target=11;
        System.out.println(last(arr,target));
      }}