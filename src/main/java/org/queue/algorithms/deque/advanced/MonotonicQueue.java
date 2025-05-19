package org.queue.algorithms.deque.advanced;

import java.util.Deque;
import java.util.LinkedList;

class MonotonicQueue {
    private Deque<Integer> deque = new LinkedList<>();

    public void push(int n) {
        while (!deque.isEmpty() && deque.peekLast() < n) {
            deque.pollLast();
        }
        deque.offerLast(n);
    }

    public void pop(int n) {
        if (!deque.isEmpty() && deque.peekFirst() == n) {
            deque.pollFirst();
        }
    }

    public int max() {
        return deque.peekFirst();
    }

    public static void main(String[] args) {
        MonotonicQueue mq = new MonotonicQueue();

        System.out.println("Pushing 3, 1, 5, 2:");
        mq.push(3);
        System.out.println("Max: " + mq.max()); // Expected: 3
        mq.push(1);
        System.out.println("Max: " + mq.max()); // Expected: 3
        mq.push(5);
        System.out.println("Max: " + mq.max()); // Expected: 5 (3 and 1 removed)
        mq.push(2);
        System.out.println("Max: " + mq.max()); // Expected: 5

        System.out.println("Popping 5:");
        mq.pop(5);
        System.out.println("Max after pop: " + mq.max()); // Expected: 2
    }
}
