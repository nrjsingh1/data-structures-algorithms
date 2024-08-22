package LinkedList;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void print(){
        log.info("[Data {} - Ref {}]", this.data, this.next);
    }
}
