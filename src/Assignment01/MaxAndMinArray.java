//Write a program to find the maximum and minimum elements in an integer array.
//a.	Sample Data: [3, 9, 1, 7, 5]
package Assignment01;

public class MaxAndMinArray {
    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 7, 5};

        // Initialize max and min to the first element of the array
        int max = arr[0];
        int min = arr[0];

        // Loop through the array to find the max and min
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max if current element is greater
            }
            if (arr[i] < min) {
                min = arr[i];  // Update min if current element is smaller
            }
        }

    }
}
