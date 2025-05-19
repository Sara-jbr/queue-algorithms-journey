package org.queue.algorithms.deque.advanced;

import java.util.*;

public class SlidingWindowMax {
    public static List<Integer> maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove elements out of current window
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Maintain decreasing order
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            // Add max for current window
            if (i >= k - 1) {
                result.add(nums[deque.peekFirst()]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(maxSlidingWindow(arr, k)); // [3, 3, 5, 5, 6, 7]
    }
}

