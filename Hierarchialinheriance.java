public class Hierarchialinheriance{

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
    
     class Dog extends animal{
        void tail(){
            System.out.println("tail");
        }
     }
     Mammals obj=new Mammals();
     obj.legs();
     //obj.tail();
     obj.eat();
     obj.breath();

    }
}