//7.	Basic ArrayList Operations: Write a program to create an ArrayList of strings, add five names, print all, then remove the second and fourth names.
//a.	Sample Data: ["John", "Emma", "Ava", "Liam", "Olivia"]
package Assignment01;

import java.util.ArrayList;

public class BasicArrayOPs {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Add five names to the ArrayList
        names.add("John");
        names.add("Emma");
        names.add("Ava");
        names.add("Liam");
        names.add("Olivia");

        // Print all names in the ArrayList
        System.out.println("Original ArrayList: " + names);

        // Remove the second name (index 1) and the fourth name (index 3)
        names.remove(1); // Removes "Emma"
        names.remove(2); // Removes "Liam" (after removing "Emma", "Liam" is now at index 2)

        // Print the updated ArrayList
        System.out.println("Updated ArrayList after removal: " + names);
    }
}
