package org.queue.algorithms.queue.advanced;

import java.util.*;

public class FirstNonRepeatingCharStream {
    public static void printFirstNonRepeating(String stream) {
        int[] freq = new int[256];
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < stream.length(); i++) {
            char ch = stream.charAt(i);
            freq[ch]++;
            queue.offer(ch);

             while (!queue.isEmpty() && freq[queue.peek()] > 1) {
                queue.poll();
            }

             if (!queue.isEmpty()) {
                System.out.print(queue.peek() + " ");
            } else {
                System.out.print("-1 ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String input = "aabcbd";
        System.out.println("Stream: " + input);
        System.out.print("Output: ");
        printFirstNonRepeating(input);
    }
}

