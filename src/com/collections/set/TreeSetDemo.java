package com.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    static void main() {
        // stores values in order

        Set<Integer> ts = new TreeSet();

        ts.add(22);
        ts.add(24);
        ts.add(26);

        System.out.println(ts);
        System.out.println(ts.contains(25)); // false


        ts.remove(24);
        System.out.println(ts);

    }
}
