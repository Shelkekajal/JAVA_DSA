public class methodoverloading{
    int display(int a,int b){
        return a+b;
       

    }
    float display(float a,float b){
         return a+b;
    }
    int display(int a,int b,int c){
        return a+b+c;

    }
    public static void main(String[]args){
        methodoverloading obj=new methodoverloading();
        int sum=obj.display(4,6);
        float sum1=obj.display((float)6.7,(float)7.8);
        int sum2=obj.display(3,5,9);
        System.out.println("Sum of a+b is "+ sum );
        System.out.println("flaot is "+sum1);
        System.out.println(("Sum of a+b+c is "+sum2));
    }
}