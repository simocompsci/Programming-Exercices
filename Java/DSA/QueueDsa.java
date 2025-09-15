
import java.util.LinkedList;
import java.util.Queue;

public class QueueDsa {
    public static void main(String[] args) {
        // queue = FIFO 
        // add = enqueue , offer() add objects to the tail
        // remove = dequeue , poll() remove objects from the head 

        Queue<String> queue = new LinkedList<>(); // we used liked list because we can t instanciate the interface (Queue)
        queue.offer("karren"); // add object at tail
        queue.offer("mohammed");
        queue.offer("hassan");
        queue.offer("chad");
        queue.poll(); // remove object from head
        queue.poll();
        queue.peek(); // look at the object at the head 
        queue.isEmpty();
        queue.contains("mohammed");
        queue.size();
        System.out.println(queue.peek());
        System.out.println(queue);

        // where are queue useful?
        // keyboard buffer (letters should appear on the screen in the order they are pressed)
        // printer queue (print jobs should be completed in order)
        // used in linkedlists , priorityqueues , Breadth-first search
    }
}
