package org.queue.algorithms.deque.basic;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new Deque<>();
        for (char c : str.toCharArray()) {
            deque.addRear(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFront() != deque.removeRear()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("hello"));   // false
    }
}

