package org.queue.algorithms.monotonicQueue.advanced;

import java.util.Arrays;
import java.util.Stack;

public class MaxOfMinWindow {
    public int[] maxOfMinForEveryWindowSize(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int[] left = new int[n];  // Previous smaller element
        int[] right = new int[n]; // Next smaller element

        Stack<Integer> stack = new Stack<>();

        // Fill previous smaller elements
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Fill next smaller elements
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Initialize result
        int[] res = new int[n + 1];
        Arrays.fill(res, Integer.MIN_VALUE);

        for (int i = 0; i < n; i++) {
            int len = right[i] - left[i] - 1;
            res[len] = Math.max(res[len], arr[i]);
        }

        // Fill remaining
        for (int i = n - 1; i >= 1; i--) {
            res[i] = Math.max(res[i], res[i + 1]);
        }

        // Copy to final result
        System.arraycopy(res, 1, result, 0, n);
        return result;
    }

    public static void main(String[] args) {
        MaxOfMinWindow solver = new MaxOfMinWindow();
        int[] arr = {10, 20, 30, 50, 10, 70, 30};

        int[] result = solver.maxOfMinForEveryWindowSize(arr);
        System.out.println("Max of Min for Every Window Size:");
        System.out.println(Arrays.toString(result));
    }
}
