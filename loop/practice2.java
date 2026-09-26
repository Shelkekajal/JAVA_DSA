//print frizz for multiples of 3, buzz for multiples of 5, and frizzbuzz for multiples of both 3 and 5.
import java.util.Scanner;
public  class practice2{
    
    public static void main(String args[]){
         int  n=15;
    int  counter3=0;
    int  counter5=0;
        for(int i=1;i<=n;i++){
         counter3++; counter5++;

         if(counter3!=3 && counter5!=5){
                System.out.print(i+" ");
            }
            else if(counter3==3){
                System.out.print("fizz"+" ");
                counter3=0;
            }
           if(counter5==5){
                System.out.print("Buzz"+" ");
                counter5=0;
            }
            
        }
    }
}