public class recursion3{
    public static int display(int n){
        if(n==1){
           return 1;
        }
        display(n-1);
        int result=n+display(n-1);
        return result;
    }
    public static void main(String args[]){
        int n=10;
        display(n);
        System.out.println(display(n));
    }
}