import java.util.Collection;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> pqueue =  new PriorityQueue<>();
        pqueue.add("A");
        pqueue.add("C");
        pqueue.add("B");
        pqueue.add("X");

        System.out.println(pqueue);

        PriorityQueue customQueue = new PriorityQueue<>(Collection.reverseOrder());
        customQueue.add("A");
        customQueue.add("B");
        customQueue.add("X");
        customQueue.add("C");
        customQueue.add("Z");

        System.out.println(customQueue);

    }
}
