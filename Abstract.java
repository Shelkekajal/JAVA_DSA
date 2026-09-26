// abstract class is gives idea by defined methods but not implemented we have to implement in child class
//alway constructor of parent class is called first then child class constructor is called even it is abstract class
abstract class teacher{//teacher is a abstract class so it can't be object
    
    teacher(){ System.out.println("I am a teacher");}//we can make constructor in abstract class

    void display(){System.out.println("Rohini teacher");}

    abstract void name();//we can make abstract method as well as non abstract method in abstract class
}
class student extends teacher{
    student(){System.out.println("I am a student");
    }    
    void name(){System.out.println("kajal");
    }
}
class student2 extends teacher{
    student2(){System.out.println("I am a student2");}
    void name(){
        System.out.println("Ram");
    }
}

public class Abstract{
    public static void main(String args[]){
       student2 s2=new student2();
     // student s1=new student();
        s2.name();
        s2.display();
        
    }
}