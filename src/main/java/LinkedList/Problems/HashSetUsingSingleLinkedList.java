package LinkedList.Problems;

import LinkedList.Node;
import LinkedList.SingleLinkedList;

public class HashSetUsingSingleLinkedList {

    public SingleLinkedList set;
    public HashSetUsingSingleLinkedList(){
        set = new SingleLinkedList();
    }

    public void add(int key) {
        //add only if the item not exists
        Node temp = set.head;
        Node newNode = new Node(key);
        if(set.head==null){
            set.head = newNode;
            return;
        }
        while(temp.next!=null){
            if(temp.data == key)
                return;
            else
                temp = temp.next;
        }
        if(temp.data!=key)
            temp.next = newNode;
    }

    public void remove(int key) {
        //remove if not, exist do nothing
        Node cur = set.head;
        Node prev = set.head;
        if(set.head==null)
            return;
        while(cur.next!=null){
            if(cur.data==key && cur==set.head){//if location is head
                set.head = cur.next;
                return;
            }
            else if(cur.data==key && cur!=set.head){ //if location is middle
                prev.next = cur.next;
                return;
            }
            else {
                prev = cur;
                cur = cur.next;
            }
        }
        //if location is last
        prev.next = null;
    }

    public boolean contains(int key) {
        Node temp = set.head;
        while(temp!=null){
            if(temp.data == key)
                return true;
            else
                temp = temp.next;
        }
        return false;
    }


    public void print(){
        set.print();
    }
}
