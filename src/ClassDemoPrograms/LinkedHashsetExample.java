package ClassDemoPrograms;
//It behaves like a HashSet (no duplicates allowed) but also maintains the insertion order of elements.
import java.util.LinkedHashSet;

public class LinkedHashsetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> lhash = new LinkedHashSet<>();

        lhash.add("D");
        lhash.add("X");
        lhash.add("K");
        lhash.add("P");
        lhash.add("B");
        System.out.println("Linkedhashset after inserting items randomly: "+lhash);
        boolean hasA = lhash.contains("A");

        System.out.println("To check if contains A before adding:"+lhash);
        lhash.add("X");
        lhash.add("A");

        System.out.println("Linkedhash set after adding duplicate and non duplicate: "+lhash);

        System.out.println("To check if contains A after adding:"+lhash);

        lhash.remove("X");
        System.out.println("After removing X: " + lhash);

        // Checking the size of the LinkedHashSet
        System.out.println("Size of HashSet: " + lhash.size());

        // Check if LinkedHashSet is empty
        System.out.println("Is LinkedHashSet empty? " + lhash.isEmpty());

        lhash.clear();
        System.out.println("Is LinkedHashSet empty? " + lhash.isEmpty());
    }
}
