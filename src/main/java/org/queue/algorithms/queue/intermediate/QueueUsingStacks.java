package org.queue.algorithms.queue.intermediate;

import java.util.Stack;

public class QueueUsingStacks<T> {
    private Stack<T> stack1 = new Stack<>();
    private Stack<T> stack2 = new Stack<>();

    // Enqueue (add element to the end)
    public void enqueue(T item) {
        stack1.push(item);
    }

    // Dequeue (remove element from the front)
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stack2.isEmpty()) {
            // Transfer elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public static void main(String[] args) {
        QueueUsingStacks<Integer> queue = new QueueUsingStacks<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.dequeue()); // 20

        queue.enqueue(40);

        System.out.println(queue.dequeue()); // 30
        System.out.println(queue.dequeue()); // 40

        System.out.println("Queue empty? " + queue.isEmpty()); // true
    }
}

