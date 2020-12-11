package LinkList;

public class LinkedList {
    //create node
    private static class Node {
        int data;           // assuming data type list is integer
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    //display list
    public  void display(){
        Node temp = this.head;
        while (temp!= null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }

    //add item to list at last position
    public void addLast(int /*assuming integer data type*/ item){
        Node nn = new Node();
        nn.data= item;
        nn.next = null;
        //attach nodes
        if(this.size>=1){
            this.tail.next=nn;
        }
        //update summary objects
        if(this.size==0){
            this.head=nn;
        }
        this.tail=nn;
        this.size++;
    }

    //add item to list at last position
    public void addFirst(int item){
        Node nn = new Node();
        nn.data= item;
        nn.next =null;

        //attach nodes
        if(this.size>=1){
            nn.next=head;
        }
        //update summary objects
        if (this.size==0){
            this.head=nn;
            this.tail=nn;
            this.size++;
        }else {
            this.head=nn;
            this.size++;
        }

    }



}
