public class recursion9{
    public static int display(int n){
     if(n==0 || n==1){
            return 1;
        }
        //vertical
        int vtiles=display(n-1);
        //horizontal 
        int htiles=display(n-2);   
        int totalway=vtiles+htiles;
        return totalway;
        }

    public static void main(String args[]){
        System.out.println(display(4));
        
    }
}
