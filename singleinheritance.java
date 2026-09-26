public class singleinheritance{
 class animal{
        void eat(){
           System.out.println("eats");
        }
        void breath(){
           System.out.println("breathning");
        }
    }
    class Mammals extends animal{
        void legs(){
            System.out.println("legs");
        }
    }
    
public static void main(String args[]){
    singleinheritance s1=new singleinheritance();
        animal obj=s1.new animal();
        obj.eat();
        //obj.legs();
    }
}