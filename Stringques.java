public class Stringques{
    public static void main(String args[]){
        String str="ShradhaDidi";
        String str1="ApnaCollege";
        String str2="ShradhaDidi";
        System.out.println(str.equals(str1));
        System.out.println(str.equals(str2));
        System.out.println(str.equals(str1)+" "+str.equals(str2));

        String st3="ApnaCollege".replace("l","");
        System.out.println(st3);
    }
}