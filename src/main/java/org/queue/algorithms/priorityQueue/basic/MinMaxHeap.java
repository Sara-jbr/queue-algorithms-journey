package org.queue.algorithms.priorityQueue.basic;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinMaxHeap {
    public static PriorityQueue<Integer> buildMinHeap(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
        }
        return minHeap;
    }

    public static PriorityQueue<Integer> buildMaxHeap(int[] nums) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            maxHeap.offer(num);
        }
        return maxHeap;
    }

    public static void printHeap(PriorityQueue<Integer> heap) {
        while (!heap.isEmpty()) {
            System.out.print(heap.poll() + " ");
        }
        System.out.println();
    }




    public static void main(String[] args) {
        int[] nums = {4, 1, 7, 3, 8};

        PriorityQueue<Integer> minHeap = MinMaxHeap.buildMinHeap(nums);
        PriorityQueue<Integer> maxHeap = MinMaxHeap.buildMaxHeap(nums);

        System.out.println("Min-Heap (ascending):");
        MinMaxHeap.printHeap(minHeap);

        System.out.println("Max-Heap (descending):");
        MinMaxHeap.printHeap(maxHeap);
    }
}