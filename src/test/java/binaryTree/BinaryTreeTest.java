package binaryTree;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Slf4j
class BinaryTreeTest {


    private BinaryTree bt;


    @BeforeEach
    void setup() {
        bt = new BinaryTree();
    }

    @Test
    public void traverseLevelOrder(){

        bt.add(8);
        bt.add(6);

        bt.add(7);
        bt.add(14);
        bt.add(11);
        bt.add(15);
        bt.add(2);
        bt.add(3);
        bt.add(5);
        bt.add(9);
        System.out.println(bt.containsNode(15));
        //bt.traverseInOrder(bt.root);
//
//						8
//				6 					14
//			2		7			11		15
//				4
//			3		5				9
        bt.traverseLevelOrder(bt.root);
    }
}