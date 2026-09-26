public class Accessmodifier{
    public static void main(String args[]){
          modifier s1=new modifier();
          s1.display("kajal");
          System.out.println("My name is : "+s1.username);
          s1.setpassword(123);
          System.out.println("Password is "+s1.getpassword());
    }
}
class modifier{
    public String username;
    private int password; // private variable for that we use get and set method
    void display(String username){
    this.username=username;
     //System.out.println("My name is : "+username);
     //return username;
    }
void setpassword(int password){
  this.password=password;
}
int getpassword(){
    return password;
}


}
