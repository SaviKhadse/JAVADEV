//5.	Reverse an Array: Write a program that reverses the elements of an array.
//a.	Sample Data: ["cat", "dog", "bird", "fish"]
package Assignment01;

public class ReverseArray {
    public static void main(String[] args) {

        String[] arr = {"cat", "dog", "bird", "fish"};

        // Print the original array
        System.out.println("Original Array:");
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println(); // New line

        // Reverse the array
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the indices towards the center
            left++;
            right--;
        }

        // Print the reversed array
        System.out.println("Reversed Array:");
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }

}
