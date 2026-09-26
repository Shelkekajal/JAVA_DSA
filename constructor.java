class Student{
    String name;
    int marks;
    Student(){//non parameterized
        System.out.println("Nice to meet you");
    }
    Student(String name,int marks){// parameterized
        this.name=name;
        this.marks=marks;
    }
}
public class constructor{
    public static void main(String args[]){
        Student s2=new Student();
         Student s1=new Student("kajal",78);
         System.out.println("my name is "+s1.name + " and marks is "+s1.marks);
         s1.Student("kajal",78);
    }
}