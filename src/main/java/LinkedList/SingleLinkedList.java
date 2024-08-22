package LinkedList;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingleLinkedList {

    public Node head;


    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void loadSingleLinkedListInSameOrder(int[] items) {
        for (int i : items) {
            this.addLast(i);
        }
    }

    public void print() {
        Node temp = head;
        log.info("Printing List with Head {}", head.data);
        while (temp != null) {
            temp.print();
            temp = temp.next;
        }
    }
}
