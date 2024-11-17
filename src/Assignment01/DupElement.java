//3.	Find Duplicates: Create a program that finds and prints duplicate elements in an array of strings.
//        a.	Sample Data: ["apple", "banana", "apple", "cherry", "banana"]
        package Assignment01;

import java.util.HashSet;

public class DupElement {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apple", "cherry", "banana"};

        // Create a HashSet to store unique elements
        HashSet<String> uniqueElements = new HashSet<>();
        // Create another HashSet to store duplicates
        HashSet<String> duplicates = new HashSet<>();

        // Loop through the array to find duplicates
        for (String element : arr) {
            // If the element is already in the unique set, add it to the duplicates set
            if (!uniqueElements.add(element)) {
                duplicates.add(element);
            }
        }

        // Print the duplicate elements
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }
    }


}
