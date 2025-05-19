package org.queue.algorithms.priorityQueue.advanced;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
    private PriorityQueue<Integer> leftHalf;  // Max-heap
    private PriorityQueue<Integer> rightHalf; // Min-heap

    public MedianFinder() {
        leftHalf = new PriorityQueue<>(Collections.reverseOrder()); // Max-heap
        rightHalf = new PriorityQueue<>();                          // Min-heap
    }

    public void addNum(int num) {
        if (leftHalf.isEmpty() || num <= leftHalf.peek()) {
            leftHalf.offer(num);
        } else {
            rightHalf.offer(num);
        }

        // Balance the heaps
        if (leftHalf.size() > rightHalf.size() + 1) {
            rightHalf.offer(leftHalf.poll());
        } else if (rightHalf.size() > leftHalf.size()) {
            leftHalf.offer(rightHalf.poll());
        }
    }

    public double findMedian() {
        if (leftHalf.size() == rightHalf.size()) {
            return (leftHalf.peek() + rightHalf.peek()) / 2.0;
        } else {
            return leftHalf.peek(); // max-heap has 1 extra
        }
    }

    public static void main(String[] args) {
        MedianFinder finder = new MedianFinder();

        int[] stream = {5, 15, 1, 3};
        for (int num : stream) {
            finder.addNum(num);
            System.out.println("Added: " + num + ", Current Median: " + finder.findMedian());
        }
    }
}
