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

    public int getFirstNode(){
        return this.head.data;
    }

    public int getLastNode(){
        return this.tail.data;
    }

    public int getNodeAt(int position) throws Exception {
        if (!(position >0 && position<=this.size)){
            throw new Exception("Position Shi Dall!");
        }
        Node temp = this.head;
        int current=1;
        while (current<position){
            temp= temp.next;
            current++;
        }
        return temp.data;
    }
}
