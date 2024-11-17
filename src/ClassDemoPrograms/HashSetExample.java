package ClassDemoPrograms;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("banana");
        set.add("Cherry");
        set.add("date");

        System.out.println("Inititl Hashset:"+ set);
        set.add("Apple");
        set.add("banana");

        System.out.println("After adding duplicates"+set);


        boolean hasCherry = set.contains("Cherry");
        System.out.println("Contains chery"+ hasCherry);


        set.remove("date");
        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
