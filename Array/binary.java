public class binary{
    public static int binarySearch(int number[],int target){
        int start=0;
        int end=number.length-1;
        while(start<=end){
            int mid=(start+end)/2; // Calculate the middle index
            if(number[mid]==target){ // Check if the middle element is the target
                System.out.println("Number found at index: " + mid);
                return target; // Exit if the target is found
            } else if(number[mid]<target){ // If target is greater, ignore left half
                start=mid+1;
            } else { // If target is smaller, ignore right half
                end=mid-1;
            }
        }
        return -1; // Return -1 if the target is not found
    }
    public static void main(String args[]){
        int number[]={23,45,67,68,69};
                int target=45; // Element to search for
        int result =binarySearch(number,target);
        System.out.println("number is found at index "+result);
    }
}
