package org.queue.algorithms.queue.advanced;

import java.util.*;

public class MaxOfSubArrays {
    public static void printMaxOfSubArrays(int[] arr, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            queue.offer(arr[i]);

            if (queue.size() > k) {
                queue.poll();
            }

            if (queue.size() == k) {
                 int max = Collections.max(queue);
                System.out.print(max + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.print("Maximum of Subarrays of size " + k + ": ");
        printMaxOfSubArrays(arr, k);
    }
}
