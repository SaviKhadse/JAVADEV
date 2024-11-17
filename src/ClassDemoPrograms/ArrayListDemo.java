package ClassDemoPrograms;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args){
        ArrayList<String> students= new ArrayList<>();
        students.add("John");
        students.add("Jane");

        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("John");
        teachers.add("Jane");
//add, addAll, remove, contains, equal,    indexOf
        System.out.println(students == teachers);
        System.out.println(students.equals(teachers));
        System.out.println(students.contains("Vinod"));

        System.out.println(students.containsAll(teachers));
        System.out.println(students.containsAll(teachers));

        int[] numbers = new int[10];

        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
    }
}
