package com.collections.queue;

import java.util.Queue;


public class LinkedList {
    static void main() {

        // Works on FIFO(First IN First OUT) principle
        // It has two ends; Rear end, where elements are added and Front end, where elements are removed
        // Think of it like a Ticket queue, the customer who comes first, will leave first after buying tickets

        Queue<Integer> queue = new java.util.LinkedList<>() ;

        // Let's add a number in the queue
        queue.offer(26);
        queue.offer(6);
        queue.offer(18);
        queue.offer(22);
        System.out.println(queue);

        // queue.add() can also be used, but if there is nothing to add the compiler throws exception.

        // Let's try to see which is the element which will be removed
        System.out.println(queue.peek());

        // queue.elements() can be used in place of peek, but if there is no element in the list, then the compiler will throw an exception

        // Let's try to delete an element from queue
        queue.poll();
        System.out.println(queue);// the first element is out.

        // queue.remove() can also be used in place of poll, but if the list is empty, then the compiler will throw exception


    }
}
