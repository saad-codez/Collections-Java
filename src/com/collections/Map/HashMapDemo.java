package com.collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    static void main() {
        // Stores values in key pairs
        // <key=Integer, value=String>
        // 101 = Bangalore, //here, 101 is a unique key and Bangalore is it's value
        // duplicates values are not added, therefore they override the existing duplicate values

        Map<Integer, String> cities = new HashMap<>();

        //Let's add the elements
        cities.put(101, "Bangalore");
        cities.put(102, "Mysore");
       // cities.put(201, "Hyderabad");
        cities.put(301, "Chennai");

        System.out.println(cities);

        // Let's try to add a duplicate value
        cities.put(202, "Hyderabad"); //key is different so it wil be added
      //  cities.put(301, "Pune"); // // since key is same, it overrides Chennai

        // Let's add condition for safety
        if (!cities.containsValue("Chennai")) {
            cities.put(301, "Pune");
        }

        cities.putIfAbsent(201, "Mumbai");//adds Mumbai if there is no value at key 201
        System.out.println(cities);


    }
}
