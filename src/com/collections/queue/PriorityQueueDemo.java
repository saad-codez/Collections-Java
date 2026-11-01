package com.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    static void main() {

        // It is unordered.
        // It implements Min Heap under the hood
        // It prints the smallest element first
        // It deletes the smallest element first (priority is given to the smallest number)

        Queue<Integer> pq = new PriorityQueue<>();

        // reverse the order, uses max heap, the largest number is given priority
       // Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(60);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        pq.offer(5);

        System.out.println(pq);

        System.out.println(pq.peek()); // prints the smallest number, i.e 5

        // Let's delete the smallest number
        pq.poll();

        System.out.println(pq);
    }
}
