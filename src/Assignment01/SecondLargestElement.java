//4.	Second Largest Element: Write a program to find the second-largest element in an integer array.
//a.	Sample Data: [45, 76, 34, 89, 76]
package Assignment01;

public class SecondLargestElement {
    public static void main(String[] args) {

        int[] arr = {45, 76, 34, 89, 76};

        // Check if the array has at least two elements
        if(arr.length < 2) {
            System.out.println("Array doesn't have enough elements to find the second-largest.");
            return;
        }

        // Initialize the largest and second-largest variables
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through the array to find the largest and second-largest elements
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;  // Update second-largest to the previous largest
                largest = num;            // Update largest to the current number
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;      // Update second-largest if the number is less than largest but greater than second-largest
            }
        }

        // Output the result
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second-largest element.");
        } else {
            System.out.println("Second-largest element: " + secondLargest);
        }
    }

}
