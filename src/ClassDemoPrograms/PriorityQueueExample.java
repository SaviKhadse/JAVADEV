package ClassDemoPrograms;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<String> pqueue =  new PriorityQueue<>();
        pqueue.add("A");
        pqueue.add("C");
        pqueue.add("B");
        pqueue.add("X");

        System.out.println(pqueue);

        PriorityQueue<String> customQueue = new PriorityQueue<>(Collections.reverseOrder());
        customQueue.add("A");
        customQueue.add("B");
        customQueue.add("X");
        customQueue.add("C");
        customQueue.add("Z");

        System.out.println(customQueue);

    }
}
