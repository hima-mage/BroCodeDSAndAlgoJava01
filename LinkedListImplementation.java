import java.util.LinkedList;

public class LinkedListImplementation {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();

        // linked list as Queue
        linkedList.offer("A");
        linkedList.offer("V");
        linkedList.offer("F");
        linkedList.offer("AQ");

        linkedList.add(2, "r");

        System.out.println(linkedList);

    }
}
