//10.	ArrayList Size and Empty Check: Write a program to check if an ArrayList is empty. If not, print its size and all its elements.
//a.	Sample Data: ["Java", "Python", "C++"]
package Assignment01;

import java.util.ArrayList;

public class ArrSizeIsEmpty {
    public static void main(String[] args) {

        ArrayList<String> lang = new ArrayList<>();

        // Add elements to the ArrayList
        lang.add("Java");
        lang.add("Python");
        lang.add("C++");

        // Check if the ArrayList is empty
        if (languages.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            // Print the size of the ArrayList
            System.out.println("The size of the ArrayList is: " + lang.size());

            // Print all elements in the ArrayList
            System.out.println("The elements in the ArrayList are: ");
            for (String lang : lang) {
                System.out.println(lang);
            }
        }
    }
}

