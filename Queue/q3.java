//As the in array to remove element takes O(n) time complexity so then 
//Circular queue can be used to remove element in O(1) time complexity
//Now Implementing circular queue using array
class q3{
    public static class Queue{
        static int arr[];
        static int rear;
        static int front;
        int size;
       
        Queue(int n){
            arr=new int[n];
            rear=-1;
            front=-1;
             size = n;
        }
        public boolean isEmpty(){
            return front==-1&&rear==-1;
        }
        public boolean isFull(){
            return (rear+1)%size==front;
        }
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(isEmpty()){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public  int remove(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }
            int result=arr[front];
            //last elemment delete
            if(front==rear){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
        }
        //peek
        public int peek(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }
            return arr[front];
        }

         void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(arr[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    }
    public static void main(String args[]){
         Queue q=new Queue(5);
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         q.add(5);
         q.remove(); // removes 1
    q.remove(); // removes 2
         q.add(6);
         q.add(7);
         q.display(); // displays 3 4 5 6 7
        //  if(!q.isEmpty()){
        //      System.out.println(q.remove());
        // }
    }
}
