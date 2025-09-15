
import java.util.PriorityQueue;
import java.util.Queue;

public class PriortQueue {
    public static void main(String args[]){
        // Priority Queue is also a FIFO data structure that serves elements with the highest priorities first before elements with lower priority

        // Queue<Double> queue = new LinkedList<>();
        Queue<Double> queue = new PriorityQueue<>(); // when we change from a linked list to a priority queue it will return the result in order of priority
        queue.offer(22.5);
        queue.offer(80.25);
        queue.offer(1.3);
        queue.offer(500.3);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        Queue<String> queue1 = new PriorityQueue<>();
        // Queue<String> queue1 = new PriorityQueue<>(Collections.reverseOrder());
         // when we change from a linked list to a priority queue it will return the result in order of priority
        queue1.offer("momo");
        queue1.offer("bli");
        queue1.offer("shaw");
        queue1.offer("hegola");

        while(!queue1.isEmpty()){
            System.out.println(queue1.poll());
        }
    }
}
