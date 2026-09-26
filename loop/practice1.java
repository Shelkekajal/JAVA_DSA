//print sum of even and odd number 
import java.util.Scanner;
public class practice{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
      int n=sc.nextInt();
        int evenSum=0;
        int oddSum=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter number "+(i+1)+":");
            int num=sc.nextInt();
            if(num%2==0){
                evenSum+=num;
            }
            else{
                 oddSum+=num;
            }
               
            }
        
        System.out.println("Sum of even number is : "+evenSum);
        System.out.println("Sum of odd number is : "+oddSum);
    }
}