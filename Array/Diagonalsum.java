
//as time complexity is O(n^2)due to nested loops
public class Diagonalsum{
public static void diagonal(int matrix[][]){
    int sum=0;
    for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
               if(i==j){
                sum+=matrix[i][j];
               
               }
               else if(i+j==matrix.length-1){
                sum+=matrix[i][j];
               }
            }
        }
        System.out.println("Sum of diagonal elements is: "+sum);
}
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        diagonal(matrix);
         // for less time complexity below code can be used
           int sum=0;
            for(int i=0;i<matrix.length;i++){
                //primary
                sum+=matrix[i][i];
                //secondary
                sum+=matrix[i][matrix.length-1-i];
            }
            System.out.println("Sum of diagonal elements with less time complexity is: "+sum);
    }
}



