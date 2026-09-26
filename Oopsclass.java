
class Student{
    String name;
    int marks;
    String display(String name){
         System.out.println(name);
         return name;
    }
    int display(int marks){
        System.out.println(marks);
        return marks;
    }
}
public class Oopsclass{
    public static void main(String args[]){
        Student s1=new Student();
        s1.display("Abhishek");
        s1.display(85);
    }
}