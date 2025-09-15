
import java.util.LinkedList;

public class LList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        // here we are treating it as a stack
        // linkedList.push("A");
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.push("F");
        // linkedList.pop();

        // here we are treating our linked list as a queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");  
        // linkedList.poll();

        linkedList.add(4, "E"); // to add eleùents at given index
        linkedList.remove("F");
        linkedList.peekFirst();
        linkedList.peekLast();
        linkedList.addFirst("0");
        linkedList.addLast("G");

        System.out.println(linkedList.indexOf("A"));
        System.out.println(linkedList);

        // uses?
        // implement stacks/queues
        // gps navigation
        // music playlist
    }
}
