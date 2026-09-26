import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
         short a=10;
         long f=45555555555L;
         float b=10.5f;
         double c=10.5d;
         long sum=(long)a+f+b+c; // Implicit type casting from short, float, and double to long
            System.out.println("Sum is: " + sum);


        float a1=10.99f;
        int b1=(int)a1; // Explicit type casting from float to int
        System.out.println("Value of b1: " + b1);
        int a2=10;
        float b2=a2; // Implicit type casting from int to float
        System.out.println("Value of b2: " + b2);

        char c1='A';
        double d1=c1;
        System.out.println("value of d1 "+d1);

        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b =sc.nextInt();
        // int sum =a*b;
        // System.out.println("Sum is: " + sum);

        // Scanner sc1=new Scanner(System.in);
        // float r=sc1.nextFloat();
        // float area=3.14f*r*r;
        // System.out.println("Area of circle is: " + area);


    }
}