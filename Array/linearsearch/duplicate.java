public class duplicate{
      public static int dup(int arr[]){
        
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                     if(arr[i]==arr[j]){
                        return arr[i];
                     }
                }
                
            }       
                
        return -1;
      }
      public static void main(String[]args){
        int arr[]={34,11,43,11,33,11,66};
        
        System.out.println(dup(arr));
        }}