
public class recursion1{
public static void printdec(int n){
      if(n==1){
        System.out.println(n);
        return;
      }
      System.out.print(n+" ");
      printdec(n-1);
}
public static void printinc(int n){
    if(n==1){
        System.out.print(n);
        return;
    }
    printinc(n-1);
    System.out.print(n +" ");
     
}


    public static void main(String args[]){
        System.out.println("Print number in decreasing order ");
         int n=10;
         printdec(n);
         System.out.println("Print number in increasing order");
         printinc(n);
    }
}