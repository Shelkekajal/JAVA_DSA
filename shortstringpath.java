public class shortstringpath{
    public static void main(String args[]){
        String str="WNEENESENNN";
        int x=0; int y=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
        }
        //NORTH
        if(ch=='N'){
           y++;
        }
        //south
        else if(ch=='S'){
             y--;
        }
        //east
        else if(ch=='E'){
            x++;
        }
        //west
        else{
            x--;
        }
        int X1=x*x;
        int Y1=y*y;
        return ( float)Math.sqrt(X2+Y2);
    }
}