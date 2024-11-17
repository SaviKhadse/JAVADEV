package ClassDemoPrograms;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.push("Apple");
        list.push("Banana");
        list.push("Cherry");
        System.out.println("After push operation: " + list);

        String firstElement = list.poll();
        System.out.println("Polled element: " + firstElement);
        System.out.println("After poll operation:" + list);

        list.add(1, "Orange");
        System.out.println("After inserting orange at 1:" + list);

        list.add("mango");
        list.push("Grapes");

        System.out.println("");

        list.addFirst("Pineapple");
        list.addLast("Watermelon");
        System.out.println("After addFirst and addLast operation:" + list);
    }
}
