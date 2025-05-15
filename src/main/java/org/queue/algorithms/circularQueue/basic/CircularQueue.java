package org.queue.algorithms.circularQueue.basic;

public class CircularQueue {
    private int[] data;
    private int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean enqueue(int value) {
        if (isFull()) return false;
        rear = (rear + 1) % capacity;
        data[rear] = value;
        size++;
        return true;
    }

    public Integer dequeue() {
        if (isEmpty()) return null;
        int value = data[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public Integer peek() {
        if (isEmpty()) return null;
        return data[front];
    }


    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);

        System.out.println("Is Full? " + cq.isFull());   // true

        System.out.println("Dequeued: " + cq.dequeue()); // 10
        System.out.println("Peek: " + cq.peek());        // 20

        cq.enqueue(40);
        System.out.println("Is Full? " + cq.isFull());   // true
    }

}
