public class pairinarray{

public static void printPair(int number[]){
    for(int i=0;i<number.length;i++){
            int current=number[i]; 
            for(int j=1+i;j<number.length;j++){
                System.out.print("(" +current+ "," + number[j] + ") ");
            }
            System.out.println();
        }
        
}
    public static void main(String args[]){
       int number[]={1,2,3,4,5};
       printPair(number);
    }
}