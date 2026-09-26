class Student{
    //String name;
    static int rollno;
     static String school;
  static void display(String name){
       System.out.println("My name is "+name);
         System.out.println("Roll no is "+rollno);
   }
}
class study extends Student{
    static String subject;
    static void display(){
        System.out.println("my school name is "+school);
    }

}


    public class Statickey{
    public static void main(String args[]){
         //Student s1=new Student();
         Student.display("kajal");
        Student.school="abc school";//in static variable we can access by class name also directly
         Student.rollno=12;
         System.out.println("Roll no is "+Student.rollno);
         System.out.println("School name is "+Student.school);

         Student s2= new Student();
         Student.display("Ravi");

        // s2.school="xyz school";//we can also  access by object name directly in static variable
         System.out.println("School name is "+s2.school);

         study obj=new study();
         obj.display();

    }
} 