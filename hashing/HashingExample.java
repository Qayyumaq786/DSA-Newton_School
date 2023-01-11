package hashing;

import java.util.HashSet;

public class HashingExample {
    public static void main(String[] args) {
        /**
         * I want to keep a running track of elements.
         * Such that I can add elements there,
         * Search if an element exist,
         * Remove elements,
         * Get size of unique elements.
         */
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(1);
        hs.add(100);
        hs.add(191);
        hs.add(200000);
        System.out.println(hs);

        System.out.println(hs.contains(1));
        System.out.println(hs.contains(5));

        hs.remove(1);

        System.out.println(hs);
        System.out.println(hs.size());
    }
}
