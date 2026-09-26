public class recursion4{
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        fib(n-1);
        fib(n-2);
        int result=fib(n-1)+fib(n-2);
        return result;
    }
    public static void main(String args[]){
        int n=5;
        fib(n);
        System.out.println(fib(n));
    }
}