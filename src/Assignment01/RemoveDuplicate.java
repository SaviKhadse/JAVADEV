//9.	Remove Duplicates from ArrayList: Create a program to remove duplicate elements from an ArrayList of strings.
//a.	Sample Data: ["apple", "banana", "apple", "cherry"]
package Assignment01;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("cherry");

        // Print original ArrayList
        System.out.println("Original ArrayList: " + list);

        // Use a HashSet to remove duplicates
        HashSet<String> set = new HashSet<>(list);

        // Clear the original list and add the unique elements back
        list.clear();
        list.addAll(set);

        // Print the ArrayList after removing duplicates
        System.out.println("ArrayList after removing duplicates: " + list);
    }
}

