package com.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    static void main() {
        // Hash set is a set of elements stored randomly
        // It generates a unique hash values to each elements internally, therefore we cannot add duplicate elements

        Set<Integer> set = new HashSet<>();

        set.add(50);
        set.add(3);
        set.add(100);
        set.add(7);
        set.add(25);
        set.add(1);
        set.add(80);

        // Let's print the set
        System.out.println(set);

        // Let's remove certain elements
        set.remove(25);

        // Let's see it set has a specific value
        System.out.println(set.contains(7));// prints true since 7 is present

        // Let's see the size
        System.out.println(set.size()); // returns the number of element

        //let's see if the set is empty
        System.out.println(set.isEmpty()); //returns fals3

        // let's delete all the elements
        set.clear();

        System.out.println(set); //empty set

        //let's see if the set is empty
        System.out.println(set.isEmpty()); //returns true

    }
}
