package org.queue.algorithms.queue.basic;

public class QueueOperation {
    int maxSize = 10;
    int front, rear;
    int[] queue = new int[maxSize];

    public QueueOperation() {
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    public boolean enqueue(int data) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full");
            return false;
        } else {
            if (front == -1) front = 0;
            queue[++rear] = data;
            return true;
        }

    }

    public int poll() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return queue[front++];
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueOperation queue = new QueueOperation();


        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);


        System.out.print("Initial Queue: ");
        queue.display();


        System.out.println("Polled: " + queue.poll());
        System.out.println("Polled: " + queue.poll());


        System.out.print("Queue after polling: ");
        queue.display();


        queue.enqueue(50);
        queue.enqueue(60);


        System.out.print("Final Queue: ");
        queue.display();
    }
}
