package org.queue.algorithms.queue.intermediate;

import java.util.*;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();


        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        for (char ch : input.toCharArray()) {
            queue.offer(ch);
            stack.push(ch);
        }

        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input1 = "madam";
        String input2 = "racecar";
        String input3 = "hello";

        System.out.println(input1 + " -> " + isPalindrome(input1));
        System.out.println(input2 + " -> " + isPalindrome(input2));
        System.out.println(input3 + " -> " + isPalindrome(input3));
    }
}
