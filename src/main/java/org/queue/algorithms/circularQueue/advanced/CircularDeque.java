package org.queue.algorithms.circularQueue.advanced;

public class CircularDeque {
    private int[] data;
    private int front, rear, size, capacity;

    public CircularDeque(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;
        front = (front - 1 + capacity) % capacity;
        data[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;
        data[rear] = value;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return true;
    }

    public int getFront() {
        return isEmpty() ? -1 : data[front];
    }

    public int getRear() {
        return isEmpty() ? -1 : data[(rear - 1 + capacity) % capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        CircularDeque deque = new CircularDeque(3);

        deque.insertLast(10);      // [10]
        deque.insertFront(20);     // [20, 10]
        deque.insertLast(30);      // [20, 10, 30]
        deque.insertFront(40);     // Fail - full

        System.out.println(deque.getFront()); // 20
        System.out.println(deque.getRear());  // 30

        deque.deleteFront();       // Remove 20
        deque.deleteLast();        // Remove 30
    }

}

