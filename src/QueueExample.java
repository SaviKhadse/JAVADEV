import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println("Initial queue:"+queue);

        int removedElement = queue.remove();
        System.out.println("Removed Element: "+removedElement);
        System.out.println("Queue after removal:"+queue);

        int frontElement = queue.peek();
        System.out.println("Front element: "+ frontElement);
        System.out.println("Queue after removal:"+queue);

        System.out.println("queue size:"+ queue.size());

        System.out.println("Is queue empty"+ queue.isEmpty());

        while (!queue.isEmpty()){
            System.out.println(queue.poll);

        }



    }
}
