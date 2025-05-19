package org.queue.algorithms.priorityQueue.basic;

import java.util.PriorityQueue;

public class KLargestElements {
    public static void findKLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) minHeap.poll();
        }
        System.out.println("Top " + k + " largest elements:");
        while (!minHeap.isEmpty()) System.out.print(minHeap.poll() + " ");
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 3;
        findKLargest(nums, k);
    }
}