package org.queue.algorithms.deque.intermediate;

import java.util.*;

public class ReverseKElements {
    public static void reverseFirstK(Queue<Integer> queue, int k) {
        if (queue == null || k > queue.size()) return;

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            deque.addFirst(queue.poll());
        }

        while (!deque.isEmpty()) {
            queue.add(deque.removeFirst());
        }

        int size = queue.size();
        for (int i = 0; i < size - k; i++) {
            queue.add(queue.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 6; i++) q.add(i);

        reverseFirstK(q, 3); // Reverses first 3: [3, 2, 1, 4, 5, 6]
        System.out.println(q);
    }
}

