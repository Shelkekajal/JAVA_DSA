//double linked list addfirst(),addlast(),addatindex(),removefirst(),removelast(),removeatindex(),printlist() 
public class l6{
   public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data ){
         this.data=data;
         this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public static void addLast(int data){
     Node newNode=new Node(data);
     size++;
     if(head==null){
        head=tail=newNode;
        return;
     }
       tail.next=newNode;
       newNode.prev=tail;
       tail=newNode;
    }

    public static int removeFirst(){
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
        head=head.next;
        head.prev=null;
        return val;
    }

    public static int removeLast(){
        if(size==0){
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        return val;
    }

    public static void add(int idx,int data){
        if(idx<0||idx>size){
            System.out.println("invalid index");
            return;
        }else if(idx==0){
            addFirst(data);
            return;
        }else if(idx==size){
            addLast(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        newNode.prev=temp;
        size++;
    }
    public static void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void printlink(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        addFirst(20);
        addFirst(10);
        addLast(30);
       addLast(40);
        printlink();

        // removeFirst();
        // printlink();
        // removeLast();
        // printlink();
        add(2,50);
        printlink();
        reverse();
        printlink();
    }
}