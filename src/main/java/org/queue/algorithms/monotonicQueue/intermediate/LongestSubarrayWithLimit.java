package org.queue.algorithms.monotonicQueue.intermediate;

import java.util.Deque;
import java.util.LinkedList;

public class LongestSubarrayWithLimit {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxDeque = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];

            while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] < num) {
                maxDeque.pollLast();
            }
            while (!minDeque.isEmpty() && nums[minDeque.peekLast()] > num) {
                minDeque.pollLast();
            }

            maxDeque.offerLast(right);
            minDeque.offerLast(right);

            while (nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > limit) {
                left++;
                if (maxDeque.peekFirst() < left) maxDeque.pollFirst();
                if (minDeque.peekFirst() < left) minDeque.pollFirst();
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubarrayWithLimit solver = new LongestSubarrayWithLimit();
        int[] nums = {8, 2, 4, 7};
        int limit = 4;

        int result = solver.longestSubarray(nums, limit);
        System.out.println("Longest Subarray with diff ≤ " + limit + ": " + result);
    }
}
