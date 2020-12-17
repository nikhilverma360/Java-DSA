package LinkList;

public class Client {
    public static void main(String[] args) throws Exception {

        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addFirst(100);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(101);
        list.addLast(40);
        list.display();
        System.out.println("----------------------------------------");
        System.out.println(list.getFirstNode());
        System.out.println("----------------------------------------");
        System.out.println(list.getLastNode());
        System.out.println("----------------------------------------");
        System.out.println(list.getNodeAt(1));
    }
}
