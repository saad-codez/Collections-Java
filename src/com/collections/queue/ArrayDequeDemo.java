package com.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeDemo {
    static void main() {

        // ArrayDeque implements queue interface
        // It can be used to add/delete elements from both the ends

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(10);       // Adds 10 at the end(offer() adds the element to the end)
        adq.offerFirst(19);  // Adds 19 at the beginning
        adq.offerLast(36);  // Adds 36 at the end
        adq.offer(28);       // Adds 28 at the end
        adq.offerLast(36);  // Adds 36 at the end
        adq.offer(47);       // Adds 47 at the end


        //Let's print the arraydeque
        System.out.println(adq);

        // Let's try to peek(see which is about to get removed) and poll(remove the peeked elements)
        System.out.println(adq.poll()); // shows 19, since it is first element
        System.out.println(adq.peekLast()); // removes 47, since it is the last element
        System.out.println(adq.pollFirst()); //removes 19, since it is the first element


    }
}
