public class rectangle{
    public static void main(String args[]){
//         int l=4;
//         //int b=4;
//         for(int i=1;i<=l;i++){
//             int star=i;
//             int space=l-star;
//             for(int j=1;j<=space;j++){
//                 // System.out.print(" ");//pyramid pattern
//                  System.out.print("  ");//rectangle pattern
//             }
//             for(int j=1;j<=star;j++){
                
//                     System.out.print("*"+" ");
               
//             }
//             System.out.println();
//         }
//     }
// }

//reverse triangle pattern
int n=1;
        //int b=4;
        for(int i=4;i>=n;i--){
            int star=i;
            int space=i-star;
             for(int j=1;j<=space;j++){
            System.out.print("  ");
               
            }
            for(int j=1;j<=star;j++){
                // System.out.print(" ");//pyramid pattern
                 System.out.print("*"+" ");//rectangle pattern
            }
            
            System.out.println();
        }
    }
}