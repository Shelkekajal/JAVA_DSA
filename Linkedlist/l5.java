public class l5{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;

 public static void addFirst(int data){
            //create a new node
            Node newNode=new Node(data);
               size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            //link it to head
            newNode.next=head;
            //update head
            head=newNode;
        }

         public static void addLast(int data){
            //create a new node
            Node newNode=new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            //link it 
            tail.next=newNode;
            //update head
            tail=newNode;
        }

           
       public int removeFirst(){
            if(size==0){
                System.out.println("list is empty");
                return Integer.MIN_VALUE;
               }else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
               }
               int val=head.data;
               head = head.next;
               size--;
               return val;
        }

        public int removeLast(){
            if(size==0){
                System.out.println("List is empty");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            Node prev=head;
            for(int i=0;i<size-2;i++){
                prev=prev.next;
            }
            int val=prev.next.next.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;
        }

public static void printlink(){
            if(head==null){
                System.out.println("list is empty");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
               temp=temp.next;
            }
            System.out.println();
        }
        
    
    public static void main(String args[]){
       l1 obj=new l1();
       obj.addFirst(1);
        obj.addFirst(2);
        obj.addFirst(3);
        obj.addLast(4);
        obj.addLast(5);
        obj.addLast(6);
       obj.printlink();
    //    obj.addFirst(2);
    //    obj.addFirst(3);
    //    obj.addLast(4);
    //    obj.addLast(5);
    //    obj.addLast(6);
      obj.removeFirst();
       obj.printlink();
    obj.removeLast();
       obj.printlink();
    }
}