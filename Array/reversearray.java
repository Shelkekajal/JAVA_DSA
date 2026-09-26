//time complexity is O(n) and space complexity is O(1)
public class reversearray{
    public static void reverse(int number[]){
        int first=0; 
        int last=number.length-1;
        while(first<last){
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;
        first++;
        last--;
        
        }
        
    }
    public static void main(String args[]){
        int number[]={1,2,1,8,9,10};
        reverse(number);
        for(int i=0;i<number.length;i++){
        System.out.print(number[i]);
        }
        
        
        }
}

//time complexity is O(n) and space complexity is O(1)
public class p1{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        for(int i=arr.length-1;i>=0;i--){
       System.out.println(arr[i]);
        }
    }
}


