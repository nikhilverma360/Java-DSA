package LinkList;

public class Client {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addFirst(100);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(101);
        list.addLast(40);
        list.display();
    }
}
