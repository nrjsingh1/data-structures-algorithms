package LinkedList;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class SingleLinkedListTest {


    private SingleLinkedList list;
    private SingleLinkedList list1;

    @BeforeEach
    public void setup(){
        list = new SingleLinkedList();
        list1 = new SingleLinkedList();
    }

    @Test
    public void mergeTwoSingleLinkLists(){
        SingleLinkedList list = new SingleLinkedList();
        list = list.insertAtEndSingleLinkedList(list, 1);
        list = list.insertAtEndSingleLinkedList(list, 3);
        list = list.insertAtEndSingleLinkedList(list, 5);
        list = list.insertAtEndSingleLinkedList(list, 7);

        SingleLinkedList list1 = new SingleLinkedList();
        list1 = list1.insertAtEndSingleLinkedList(list1, 1);
        list1 = list1.insertAtEndSingleLinkedList(list1, 3);
        list1 = list1.insertAtEndSingleLinkedList(list1, 5);


        System.out.println(list.printSingleLinkedList(list));

        System.out.println(list1.printSingleLinkedList(list1));

    }
}