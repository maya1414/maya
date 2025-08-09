package dataStructures;

import java.util.*;

public class SimpleMap<K, V> {

    private final HashMap<K, V> hashMap;
    private final LinkedList<K> Order;

    public SimpleMap() {
        this.hashMap = new HashMap<>();
        this.Order = new LinkedList<>();
    }

    public void put(K key, V value) {
        if (!hashMap.containsKey(key)) {
            Order.add(key);
        }
        hashMap.put(key,value);
    }

    public boolean containKey(K key) {
        return hashMap.containsKey(key);
    }

    public void remove(K key) {
        if (hashMap.containsKey(key)) {
            hashMap.remove(key);
            Order.remove(key);
        }
    }

    public int size() {
        return hashMap.size();
    }

    public ArrayList getInOrder() {
        return new ArrayList(Order);
    }
}