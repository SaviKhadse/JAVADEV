//Write a program to find the sum of all elements in an integer array.
//a.	Sample Data: [5, 10, 15, 20]
package Assignment01;

public class ArraySum {
    public static void main(String[] args) {
        int[] intarr= {5, 10, 15, 20};
        int count =0;
        for (int i = 0; i <intarr.length ; i++) {
            count= count+intarr[i];
        }
        System.out.println(count);
    }

}
