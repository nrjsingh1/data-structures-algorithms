package LinkedList;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Slf4j
class SingleLinkedListTest {

    private SingleLinkedList list;

    @BeforeEach
    void setup(){
        list = new SingleLinkedList();

    }
    @Test
    void addFirst() {
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.print();
        Assertions.assertEquals(1, list.head.data);
    }

    @Test
    void addLast() {
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.print();
        Assertions.assertEquals(4, list.head.next.next.next.data);
    }

    @Test
    void addLastOnEmptyList() {
        list.addLast(1);
        list.print();
        Assertions.assertEquals(1, list.head.data);
    }

}