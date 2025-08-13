package dataStructures;

import java.util.*;

public class SimpleMap<K, V> {

    private final HashMap<K, V> hashMap;
    private final LinkedList<K> order;
    private HashMap<K, ListIterator<K>> iteratorMap = new HashMap<>();


    public SimpleMap() {
        this.hashMap = new HashMap<>();
        this.order = new LinkedList<>();
        this.iteratorMap = new HashMap<>();
    }

    public void put(K key, V value) {
        if (!hashMap.containsKey(key)) {
            ListIterator<K> keyIterator = order.listIterator(order.size());
            keyIterator.add(key);
            keyIterator.previous();
            iteratorMap.put(key, keyIterator);
        }
        hashMap.put(key,value);
    }

    public boolean containKey(K key) {
        return hashMap.containsKey(key);
    }

    public void remove(K key) {
        if (hashMap.containsKey(key)) {
            hashMap.remove(key);
            ListIterator<K> keyIterator= iteratorMap.get(key);
            iteratorMap.remove(key);
            keyIterator.remove();
        }
    }

    public int size() {
        return hashMap.size();
    }

    public ArrayList getInOrder() {
        return new ArrayList(order);
    }
}