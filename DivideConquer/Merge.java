public class Merge{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        //kaam
       int mid=(si+ei)/2;
       mergeSort(arr,si,mid);
       mergeSort(arr,mid+1,ei);
       merge(arr,si,ei,mid);
    }
    public static void merge(int arr[],int si,int ei,int mid){
        int temp[]=new int[ei-si+1];//initial new index temp;
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //copying remaining elements of right subarray
    while(i<=mid){
        temp[k++]=arr[i++];
    }
    // copying remaining elements of left subarray
    while(j<=ei){
        temp[k++]=arr[j++];
    }
    // //copying back to original arrayjava Merge.java
    for(k=0,i=si;k<temp.length;k++,i++){
        arr[i]=temp[k];
    }
    }
    public static void main(String args[]){
        int arr[]={4,5,9,3,4,2,1,6,8,7};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);

    }
}