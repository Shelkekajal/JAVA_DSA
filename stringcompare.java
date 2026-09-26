public class stringcompare{
    public static void main(String args[]){
        String s1="hello";
        String s2=new String("hello");//string check the values of the strings by using equals() function
        if(s1.equals(s2)){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }

        //substring
        String str="hello world";
        System.out.println(str.substring(2,5));
    }
}