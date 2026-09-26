public class recursion7{
    public static int firstoccured(int arr[],int i){
       int key=5;
          if(arr[i]==key){
            return i;
          }

          return firstoccured(arr,i+1);
  }
public static int lastoccured(int arr[],int key,int i){
  if(i==arr.length){
    return -1;
   
  }
  
   int isFound=lastoccured(arr,key,i+1);
   if( isFound==-1 && arr[i]==key){
    return i;
   }
   return isFound;
}
    public static void main(String args[]){
       int arr[]={1,3,4,1,7,5,7,1,4,5,8,9};
       firstoccured(arr,0);
       System.out.println(firstoccured(arr,0));

       lastoccured(arr,5,0);
       System.out.println(lastoccured(arr,5,0));
    }
}