package LinkedList;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Slf4j
class SingleLinkedListTestOld {


    private SingleLinkedListOld list;
    private SingleLinkedListOld list1;

    @BeforeEach
    public void setup(){
        list = new SingleLinkedListOld();
        list1 = new SingleLinkedListOld();
    }



    @Test
    public void demo(){

        list = list.insertAtHeadSingleLinkedList(list, 5);
        list = list.insertAtHeadSingleLinkedList(list, 7);
        list = list.insertAtHeadSingleLinkedList(list, 8);
        list = list.insertAtEndSingleLinkedList(list, 4);
        list = list.insertAtEndSingleLinkedList(list, 3);
        list = list.insertAtLocationSingleLinkedList(list, 3, 6);
        System.out.println(list.printSingleLinkedList(list));
        System.out.println("Data present in list ->"+list.searchInSingleLinkedList(list, 34));
        list = list.deleteAtHeadSingleLinkedList(list);
        System.out.println(list.printSingleLinkedList(list));
        list = list.deleteAtEndSingleLinkedList(list);
        System.out.println(list.printSingleLinkedList(list));
    }

    @Test
    public void mergeTwoSingleLinkLists(){
        SingleLinkedListOld list = new SingleLinkedListOld();
        list = list.insertAtEndSingleLinkedList(list, 1);
        list = list.insertAtEndSingleLinkedList(list, 3);
        list = list.insertAtEndSingleLinkedList(list, 5);
        list = list.insertAtEndSingleLinkedList(list, 7);

        SingleLinkedListOld list1 = new SingleLinkedListOld();
        list1 = list1.insertAtEndSingleLinkedList(list1, 1);
        list1 = list1.insertAtEndSingleLinkedList(list1, 3);
        list1 = list1.insertAtEndSingleLinkedList(list1, 5);


        System.out.println(list.printSingleLinkedList(list));

        System.out.println(list1.printSingleLinkedList(list1));

    }
}