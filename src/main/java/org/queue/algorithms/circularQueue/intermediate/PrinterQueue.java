package org.queue.algorithms.circularQueue.intermediate;

import org.queue.algorithms.circularQueue.basic.CircularQueue;

import java.util.LinkedList;
import java.util.Queue;

class PrinterQueue {
    private CircularQueue queue;

    public PrinterQueue(int capacity) {
        this.queue = new CircularQueue(capacity);
    }

    public void addJob(int jobId) {
        if (!queue.enqueue(jobId)) {
            System.out.println("Queue is full. Cannot add job: " + jobId);
        }
    }

    public void processJobs() {
        while (!queue.isEmpty()) {
            int job = queue.dequeue();
            System.out.println("Processing job: " + job);
        }
    }

    public static void main(String[] args) {
        PrinterQueue printer = new PrinterQueue(3);

        printer.addJob(1);
        printer.addJob(2);
        printer.addJob(3);
        printer.addJob(4); // Will fail - queue is full

        printer.processJobs(); // Prints 1, 2, 3
    }

}
