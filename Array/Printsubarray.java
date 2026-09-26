public class Printsubarray{
    public static void printSubarray(int number[]){
        int totalSubarray = 0;
    for(int i=0;i<number.length;i++){
        int start=i;
        for(int j=i;j<number.length;j++){// for(int j=number.length-1;j>=start;j--)//2345,345,45,5
            int end=j;
            for(int k=start;k<=end;k++){
                System.out.print(number[k]+" ");
            }
            totalSubarray++;
            System.out.println();
        }
        System.out.println("----------");
    }
    System.out.println("Total subarrays: " + totalSubarray);
    }
    public static void main(String args[]){
        int number[]={1,2,3,4,5};
        printSubarray(number);
    }
}