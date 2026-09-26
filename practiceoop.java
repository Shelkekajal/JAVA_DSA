class Vechicle{
    void print(){
         System.out.print("base class");
    }
   
}
class Car extends Vechicle{
    void print(){
        System.out.println("child class");
    }
    
}
public class practiceoop{
    public static void main(String args[]){
       Vechicle v=new Car();
       v.print();
    }
}