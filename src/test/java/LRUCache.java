import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    class Node {
        int key;
        int value;
        Node next;
        Node prev;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    private int capacity;
    private Map<Integer, Node> cacheMap;
    private Node head;
    private Node tail;

    // Constructor to initialize the cache with a given
    // capacity
    LRUCache(int capacity) {
        this.capacity = capacity;
        this.cacheMap = new HashMap<>();
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    // Function to get the value for a given key
    int get(int key) {
        if (!cacheMap.containsKey(key)) {
            return -1;
        }

        Node node = cacheMap.get(key);
        remove(node);
        add(node);
        return node.value;
    }

    // Function to put a key-value pair into the cache
    void put(int key, int value) {
        if (cacheMap.containsKey(key)) {
            Node oldNode = cacheMap.get(key);
            remove(oldNode);
        }

        Node node = new Node(key, value);
        cacheMap.put(key, node);
        add(node);

        if (cacheMap.size() > capacity) {
            Node nodeToDelete = tail.prev;
            remove(nodeToDelete);
            cacheMap.remove(nodeToDelete.key);
        }
    }

    // Add a node right after the head (most recently used
    // position)
    private void add(Node node) {
        Node nextNode = head.next;
        head.next = node;
        node.prev = head;
        node.next = nextNode;
        nextNode.prev = node;
    }

    // Remove a node from the list
    private void remove(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    void printCache(){
        Node temp = this.head.next;
        while(temp.key!=-1){
            System.out.printf("Key : %d , Value : %d -> ", temp.key, temp.value);
            temp = temp.next;
        }
        System.out.println();
    }
}

class Runner {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1); cache.printCache();
        cache.put(2, 2); cache.printCache();
        System.out.println(cache.get(1));  cache.printCache();
        cache.put(3, 3); cache.printCache();
        System.out.println(cache.get(2));  cache.printCache();
        cache.put(4, 4); cache.printCache();
        System.out.println(cache.get(1)); cache.printCache();
        System.out.println(cache.get(3)); cache.printCache();
        System.out.println(cache.get(4)); cache.printCache();
    }
}

