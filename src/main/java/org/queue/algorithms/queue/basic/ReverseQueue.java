package org.queue.algorithms.queue.basic;

import java.util.*;

public class ReverseQueue {

    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println("Original Queue: " + queue);
        queue = reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}
