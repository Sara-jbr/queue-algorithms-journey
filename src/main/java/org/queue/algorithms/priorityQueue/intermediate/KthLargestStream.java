package org.queue.algorithms.priorityQueue.intermediate;

import java.util.PriorityQueue;

public class KthLargestStream {
    private PriorityQueue<Integer> minHeap;
    private final int k;

    public KthLargestStream(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        for (int num : nums) add(num);
    }

    public int add(int val) {
        minHeap.offer(val);
        if (minHeap.size() > k) minHeap.poll();
        return minHeap.peek();
    }

    public static void main(String[] args) {
        KthLargestStream stream = new KthLargestStream(3, new int[]{4, 5, 8, 2});
        System.out.println(stream.add(3));
        System.out.println(stream.add(5));
        System.out.println(stream.add(10));
        System.out.println(stream.add(9));
    }
}