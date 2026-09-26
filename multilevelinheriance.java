public class multilevelinheriance{

    public static void main(String args[]){
        class animal{
            void eat(){
                System.out.println("eating");
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
    
     class Dog extends Mammals{
        void tail(){
            System.out.println("tail");
        }
     }
     Mammals obj=new Mammals();
     obj.legs();
     obj.eat();
     obj.breath();
     Dog obj2=new Dog();
     obj2.tail();
        obj2.legs();
        
    }
}