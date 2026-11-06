package com.collections.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    static void main() {
        // stores the elements in the order of it's keys

        Map<String, Integer> tm = new TreeMap<>();
        tm.put("One", 1);
        tm.put("Two", 2);
        tm.put("Three", 3);
        tm.put("Four", 4);
        tm.put("Five", 5);

        System.out.println(tm); // Will sort in alphabetic order of the key values.

        tm.remove("Three");
        System.out.println(tm);

    }
}
