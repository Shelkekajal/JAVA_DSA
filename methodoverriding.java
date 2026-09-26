
    class parent{
        void height(){
            System.out.println("height is 5.6 feet");
        }
    }
    class child extends parent{
        void height(){
            System.out.println("height is 5.6 feet");
        } 
    }
public class methodoverriding {
        public static void main(String args[]){
           parent s1=new parent();
           s1.height();
          
    }
}