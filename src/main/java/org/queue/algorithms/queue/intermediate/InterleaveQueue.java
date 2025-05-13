package org.queue.algorithms.queue.intermediate;

import java.util.*;

public class InterleaveQueue {

    public static void interleave(Queue<Integer> queue) {
        if (queue.size() % 2 != 0) {
            System.out.println("Queue size must be even");
            return;
        }

        int halfSize = queue.size() / 2;
        Queue<Integer> firstHalf = new LinkedList<>();


        for (int i = 0; i < halfSize; i++) {
            firstHalf.offer(queue.poll());
        }


        while (!firstHalf.isEmpty()) {
            queue.offer(firstHalf.poll());
            queue.offer(queue.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println("Original Queue: " + queue);
        interleave(queue);
        System.out.println("Interleaved Queue: " + queue);
    }
}

