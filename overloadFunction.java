
// function overloading using the different (number of parameters) OR (data type ) with same name of functions 
// public class overloadFunction{
//     public static void sum(int  a,int b){
//         int result=a+b;
//         System.out.println("sum of 1st "+result);
//     }
//     public static void sum(int a,int b,int c){
//         int result=a+b+c;
//         System.out.println("sum of 2nd "+result);
//     }
//     public static void sum(float a, float b){
//         float result=a+b;
//         System.out.println("sum of float "+result);
//     }
//     public static void main(String args[]){
//             sum(6,7);
//             sum(5,1,6);
//             sum(56.6f,11.3f);
//     }
// }

//product of a and b

// public class overloadFunction{
//     public static int product(int a, int b){
//        // int result=a*b;
//         return a*b;
//     }
//     public static void main(String args[]){
//         int result=product(4,5);
//         System.out.println("product a and b is " + result);
//     }
    
// }

//factorial 
public class overloadFunction{
    public static void main(String args[]){
        int factorial=1;
        for(int i=1;i<=6;i++){
            factorial*=i;
          //  System.out.print("factorial is ");
            System.out.println("factorial is "+ factorial);
        }
    }
}