class P1{
    public static void display(int arr[],int i,int val){
          if(i==arr.length){
            return;
          }
          //arr[i]=val;
          display(arr,i+1,val+1);
          arr[i]=val;
          arr[i]=arr[i]-2;
    }
           public static void printArr(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
          }
    
    public static void main(String args[]){
        int arr[]=new int[5];
        display(arr,0,1);
        printArr(arr);


    }
}