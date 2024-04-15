public class Linkedlist{

    public static class Node{
        int data;
        Node next;//refernce var
        public Node(int data){// constructor : paramter constructor
            this.data = data;
            this.next = null;
        }
    }

    
    public static Node head;
    public static Node tail;
    public static int size = 1;
    public void addFirst(int data){
        //create new node
        Node newNode = new Node(data);
        
        if(head == null){
            head = tail = newNode;
            return;
        }
        size++;
        //newNode's next = head
        newNode.next = head; //address in head given to node ka node
        //above show linking

        //head = newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = tail = newNode;
            return;
        }
        size++;
        //tail next = newnode
        tail.next = newNode;

        //tail = newnode
        tail = newNode;
    }

    public void print(){//O(n)
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        // if(head == null){
        //     head = tail = null;
        //     return;
        // }
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size --;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size -1
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data; // temp ka data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }
    public static void main(String args[]){
       Linkedlist ll = new Linkedlist();
       ll.addFirst(2);
       ll.print();
       ll.addFirst(1);
       ll.print();
       ll.addLast(3);
       ll.print();
       ll.addLast(4);
       ll.print();
       ll.add(2, 9);
       ll.print();
       //methods in func
    //    ll.head = new Node(1);
    //    ll.head.next = new Node(2);
    // System.out.println(ll.size);
    ll.removeFirst();
    ll.print();
    System.out.println(ll.size);
    ll.removeLast();
    ll.print();
    System.out.println(ll.size);
    }
}