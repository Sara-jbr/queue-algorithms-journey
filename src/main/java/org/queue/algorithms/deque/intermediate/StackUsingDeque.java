package org.queue.algorithms.deque.intermediate;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingDeque {
    private Deque<Integer> deque = new ArrayDeque<>();

    public void push(int x) {
        deque.addLast(x);
    }

    public int pop() {
        return deque.removeLast();
    }

    public int top() {
        return deque.peekLast();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingDeque stack = new StackUsingDeque();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.top()); // 20
        System.out.println(stack.pop()); // 20
        System.out.println(stack.pop()); // 10
    }
}

