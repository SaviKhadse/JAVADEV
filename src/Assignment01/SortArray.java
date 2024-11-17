//8.	Sorting ArrayList: Write a program to sort an ArrayList of integers in ascending order.
package Assignment01;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some integers to the ArrayList
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(23);
        numbers.add(56);

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + numbers);

        // Sort the ArrayList in ascending order using Collections.sort()
        Collections.sort(numbers);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList in ascending order: " + numbers);
    }

}
