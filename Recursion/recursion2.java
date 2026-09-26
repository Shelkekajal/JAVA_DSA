// public class recursion2{
//   public static int factorial(int n){
//     if(n==0){
//       return 1;
//     }
//     factorial(n-1);
//     int fact=n*factorial(n-1);
//     return fact;
//   }
//     public static void main(String args[]){
//        int n=5;
//        factorial(n);
//        System.out.println(factorial(n));
//     }
// }



public class recursion2 {
 
    
  public static int fib(int n) {
    System.out.println("Entering fib(" + n + ")");
    if (n == 0 || n == 1) return n;

    int a = fib(n - 1);
    int b = fib(n - 2);

    int result = a + b;
    System.out.println("Returning fib(" + n + ") = " + result);
    return result;
  }
     public static void main(String args[]) {
      int n=4;
      fib(n);
}
  
}
