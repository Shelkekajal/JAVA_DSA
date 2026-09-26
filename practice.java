
// This program calculates the sum of the first 5 natural numbers
// public class practice{

//     public static void main(String args[]){
//       int sum=0;
//     for(int i=1;i<=5;i++){
//         sum=sum+i;
//        }
    
//             System.out.println("total sum of n number "+sum);
        
//     }
// }



// This program checks if a number is prime or not
import java.util.Scanner;
public class practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i%i==0){
            System.out.println(i+ " is a prime number");
        } else {
            System.out.println(i+ " is not a prime number");
        }
    }
}