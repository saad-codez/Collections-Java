package com.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    static void main() {
        // Same as hashset, does not allow duplicate elements
        // But stores the element in insertion order

        Set<Integer> lhs = new LinkedHashSet();

        for (int i = 10; i <= 100; i+=10) {
            lhs.add(i);
        }
        System.out.println(lhs);

        lhs.remove(40);
        System.out.println(lhs.contains(30));
        System.out.println(lhs.size());
        System.out.println(lhs);

    }
}
