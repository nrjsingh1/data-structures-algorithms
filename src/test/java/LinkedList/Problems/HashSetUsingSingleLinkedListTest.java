package LinkedList.Problems;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class HashSetUsingSingleLinkedListTest {

    private HashSetUsingSingleLinkedList set;

    @BeforeEach
    void setup() {
        set = new HashSetUsingSingleLinkedList();
    }

    @Test
    void add() {
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(5);
        set.add(2);
        set.print();
    }

    @Test
    void remove() {
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(5);
        set.add(2);
        set.print();
        set.remove(2);
        set.print();
    }

    @Test
    void contains() {
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(5);
        set.add(2);
        Assertions.assertTrue(set.contains(3));
        Assertions.assertFalse(set.contains(8));
    }

    @Test
    void testCase() {
        set.add(1);set.print();
        set.add(2);set.print();
        assertTrue(set.contains(1));
        assertFalse(set.contains(3));
        set.add(2);set.print();
        assertTrue(set.contains(2));
        set.remove(2);set.print();
        assertFalse(set.contains(2));
    }

    @Test
    void testCase2(){

        set.contains(72);
        set.remove(91);
        set.add(48);
        set.add(41);
        set.contains(96);
        set.remove(87);
        set.contains(48);
        set.contains(49);
        set.add(84);
        set.add(82);
        set.add(24);
        set.add(7);
        set.remove(56);
        set.add(87);
        set.add(81);
        set.add(55);
        set.add(19);
        set.add(40);
        set.add(68);
        set.add(23);
        set.add(80);
        set.add(53);
        set.add(76);
        set.contains(93);
        set.add(95);
        set.contains(95);
        set.add(67);
        set.add(31);
        set.contains(80);
        set.add(62);
        set.add(73);
        set.remove(97);
        set.add(33);
        set.add(28);
        set.add(62);
        set.add(81);
        set.add(57);
        set.contains(40);
        set.add(11);
        set.add(89);
        set.add(28);
        set.remove(97);
        set.contains(86);
        set.add(20);
        set.contains(5);
        set.add(77);
        set.add(52);
        set.add(57);
        set.add(88);
        set.add(20);
        set.contains(48);
        set.remove(42);
        set.remove(86);
        set.add(49);
        set.remove(62);
        set.contains(53);
        set.add(43);
        set.remove(98);
        set.add(32);
        set.add(15);
        set.add(42);
        set.add(50);
        set.contains(19);
        set.contains(32);
        set.add(67);
        set.remove(84);
        set.remove(60);
        set.remove(8);
        set.remove(85);
        set.add(43);
        set.add(59);
        set.contains(65);
        set.add(40);
        set.add(81);
        set.remove(55);
        set.add(56);
        set.add(54);
        set.add(59);
        set.add(78);
        set.add(53);
        set.add(0);
        set.add(24);
        set.add(7);
        set.remove(53);
        set.add(33);
        set.remove(69);
        set.remove(86);
        set.add(7);
        set.remove(1);
        set.add(16);
        set.remove(58);
        set.add(61);
        set.add(34);
        set.add(53);
        set.remove(84);
        set.remove(21);
        set.remove(58);
        set.add(25);
        set.contains(45);
        set.add(3);
    }
}