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
    public static void main(String args[]){
       Linkedlist ll = new Linkedlist();
       //methods in func
    //    ll.head = new Node(1);
    //    ll.head.next = new Node(2);
    }
}