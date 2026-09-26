public class recursion10{
    public static void display(String str,int i,StringBuilder newStr,boolean map[]){
        if(i==str.length()){
            System.out.print(newStr);
            return;
        }
         char currchar=str.charAt(i);
        if(map[currchar-'a']==true){
            display(str,i+1,newStr,map);
        }
        else{
            map[currchar-'a']=true;
            display(str,i+1,newStr.append(currchar),map);
            
           
        }
       
    }
    public static void main(String args[]){
         String str="abccdd";
        display(str,0,new StringBuilder(""),new boolean[26]);
         

    }
}