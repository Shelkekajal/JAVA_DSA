// public class Array{
//     public static void main(String args[]){
//         int n=5;
// int marks[]={85,90,78,88,92};
// for(int i=0;i<n;i++){
//     System.out.println(marks[i]);
// }

//     }
// }
//         int marks[]=new int[5];
//         marks[0] = 85; // Marks in Maths
//         marks[1] = 90; // Marks in Physics  
//         marks[2] = 78; // Marks in Biology
//         marks[3] = 88; // Marks in English
//         marks[4] = 92; // Marks in Marathi

//         System.out.println("Marks in Maths: " + marks[0]);
//         System.out.println("Marks in Physics: " + marks[1]);    
//         System.out.println("Marks in Biology: " + marks[2]);
//         System.out.println("Marks in English: " + marks[3]);
//         System.out.println("Marks in Marathi: " + marks[4]);
//         System.out.println("Total Marks: " + (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]));
//         System.out.println("Average Marks: " + (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 5.0);
//         System.out.println("Percentage: " + ((marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 500.0) * 100);
                  
//     }
// }



//passing array as argument (call by reference)

// public class Array{
//     public static int[] display(int marks[]){
    
//              marks[3]=95; // Updating marks in English
//             return marks;
//     }
//     public static void main(String args[]){
//             int marks[] = display(new int[]{85, 90, 78, 88, 92}); // Assign returned array to marks
             
//            System.out.println("Marks in Maths: " + marks[0]);
//              System.out.println("Marks in Physics: " + marks[1]);    
//              System.out.println("Marks in Biology: " + marks[2]);
//              System.out.println("Marks in English: " + marks[3]);// Updated marks in English
//              System.out.println("Marks in Marathi: " + marks[4]);
//     }
// }


//call by value----java supports only call by value, but when we pass an array to a method, we are passing the 
// reference of the array, so it behaves like call by reference.
//  However, if we pass a primitive data type (like int, float, etc.), it behaves like call by value.
public class Array{
    public static void update(int marks[],int b){
        b=10;
     for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
       int marks[] = {85, 90, 78, 88, 92}; // Initializing array with marks
       int b=100;
        update(marks,b); // Passing array as argument
        System.out.println(b);
         System.out.println("Marks in Maths: " + marks[0]);
         System.out.println("Marks in Physics: " + marks[1]);    
         System.out.println("Marks in Biology: " + marks[2]);
       System.out.println("Marks in English: " + marks[3]);
        
    }
}