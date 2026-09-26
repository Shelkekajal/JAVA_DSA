public class l1{
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

        //Adding elements from front
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

        public static void add(int idx,int data){
            Node newNode=new Node(data);
            size++;
            Node temp=head;
            int i=0;
            while(i<idx-1){
            temp=temp.next;
            i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
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
            int val=prev.next.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;
        }

        public int iterative(int key){
            Node temp=head;
            int i=0;
            while(temp!=null){
                if(temp.data==key){//key found
                    return i;
                }
                temp=temp.next;
                i++;
            }
            //key not
            return -1;
        }
       
       public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
       }


       public int recursive(int key){
        return helper(head,key);
       }
       public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
        next=curr.next;
        curr.next=prev;
         prev=curr;
        curr=next;
        }
         head=prev;
       }

       public void deletenthnode(int n){
            int sz=0;
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
                sz++;
                
            }
            if(n==sz){
               head=head.next;//remove first
               return;
            }
           int i=1;
           int find=sz-n;
           Node prev=head;
           while(i<find){
            prev=prev.next;
            i++;
           }
           prev=prev.next.next;
           return;
        }
         
         //slow-fast approach
         public Node findMid(Node head){
            Node slow=head;
            Node fast=head;
            while(fast.next!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;//slow is mid
         }
        
        public boolean palindrom(){
            if(head==null || head.next==null){
                return true;
            }
            //find mid
            Node midNode=findMid(head);
           
           //reverse 2nd half
            Node prev=null;
            Node curr=midNode;//start with mid node
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node right=prev;//right half head
            Node left=head;//left head
            while(right!=null){
                if(left.data!=right.data){
                    return false;
                }
                left=left.next;
                right=right.next;
            }
            return true;
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
       obj.add(3,7);
       obj.printlink();
    //    System.out.println(obj.size);
    //    System.out.println(obj.removeFirst());
    //    obj.printlink();
    //    System.out.println(obj.size);
    //    System.out.println(obj.removeLast());
    //    obj.printlink();
    //    System.out.println(obj.size);
    
    //    System.out.println( obj.iterative(7));
    //    System.out.println( obj.recursive(7));
    //    obj.reverse();
    //    obj.printlink();
       obj.deletenthnode(7);
       obj.printlink();
       System.out.println(obj.palindrom());
    }
}