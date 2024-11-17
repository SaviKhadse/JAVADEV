//6.	Remove Element from Array: Write a program to remove a specific element from an array using loops.
//a.	Sample Data: ['a', 'b', 'c', 'd', 'e'], remove 'c'
package Assignment01;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        char elementToRemove = 'c';

        // Find the index of the element to remove
        int indexToRemove = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToRemove) {
                indexToRemove = i;
                break;
            }
        }

        // If the element is found, remove it
        if (indexToRemove != -1) {
            // Create a new array with one less element
            char[] newArr = new char[arr.length - 1];

            // Copy elements except the one to remove
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != indexToRemove) {
                    newArr[j++] = arr[i];
                }
            }

            // Print the new array
            System.out.println("Array after removing element '" + elementToRemove + "': " + Arrays.toString(newArr));
        } else {
            System.out.println("Element '" + elementToRemove + "' not found in the array.");
        }
    }

}
