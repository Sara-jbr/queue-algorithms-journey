package org.queue.algorithms.deque.basic;

import java.util.LinkedList;

public class Deque<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void addFront(T value) {
        list.addFirst(value);
    }

    public void addRear(T value) {
        list.addLast(value);
    }

    public T removeFront() {
        return list.isEmpty() ? null : list.removeFirst();
    }

    public T removeRear() {
        return list.isEmpty() ? null : list.removeLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }


    public static void main(String[] args) {

        Deque<Integer> deque = new Deque<>();
        System.out.println("Adding elements to front and rear:");
        deque.addFront(10);
        deque.addRear(20);
        deque.addFront(5);
        deque.addRear(25);

        System.out.println("Size: " + deque.size()); // Expected: 4

        System.out.println("Removing from front: " + deque.removeFront()); // Expected: 5
        System.out.println("Removing from rear: " + deque.removeRear());   // Expected: 25

        System.out.println("Size after removals: " + deque.size()); // Expected: 2

        System.out.println("Is deque empty? " + deque.isEmpty()); // Expected: false

        deque.removeFront();
        deque.removeRear();

        System.out.println("Is deque empty after clearing? " + deque.isEmpty()); // Expected: true
    }
}

