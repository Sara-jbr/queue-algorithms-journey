package org.queue.algorithms.queue.advanced;

import java.util.*;

public class LRUCache {
    private int capacity;
    private LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        if (cache.size() >= capacity) {
             Iterator<Map.Entry<Integer, Integer>> iterator = cache.entrySet().iterator();
            if (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        }
        cache.put(key, value);
    }

    public void displayCache() {
        System.out.println("Current Cache: " + cache);
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);

        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);
        lruCache.displayCache();

        System.out.println("Get 2: " + lruCache.get(2));
        lruCache.displayCache();

        lruCache.put(4, 4);
        lruCache.displayCache();

        System.out.println("Get 1: " + lruCache.get(1));
    }
}
