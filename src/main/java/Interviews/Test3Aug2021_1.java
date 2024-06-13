package Interviews;

import java.util.ArrayList;
import java.util.List;

class Node{
    int value;
    Node next;

    Node (int val){
        this.value = val;
        this.next = null;
    }
}

class LinkedList{

    Node head;
    public Node add(int value){

        if(head==null){
            head = new Node(value);
            return head;
        }

        Node node = new Node(value);
        node.next = head;
        head = node;
        return head;
    }

    public void printList(){
        Node node = head;
        while(node!=null){
            System.out.print(node.value+"->");
            node = node.next;
        }
        System.out.println();
    }

    public int findMiddle(){
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next !=null && fast.next.next !=null ){
            fast = fast.next.next;
            slow = slow.next;
        }
       return slow.value;
    }
}

public class Test3Aug2021_1 {



    public static void main(String[] args) {
        //create own linkList
        //add
        //findMiddle - middle element
//        LinkedList list = new LinkedList();
//        list.add(11);
//        list.add(15);
//        list.add(13);
//        list.add(18);
//        list.add(81);
//        list.add(41);
//        list.add(61);
//        list.add(19);
//        list.add(21);
//        list.add(14);
//        list.printList();
//        System.out.println("Middle element- "+ list.findMiddle());
//
        String s = "xyzabcdefgfedcbaxyxmnmabcdc";
        List<String> list = findPalindrome(s);
        for(String temp : list)
            System.out.println(temp);


        //#2 all possible palindromes in string

    }
    public  static List<String> findPalindrome(String s){
        List<String> list = new ArrayList<>();
        for(int i =0;i<s.length();i++){
            for(int j =i;j<s.length();j++){
                if(checkPalindrome(s.substring(i,j+1)) && !list.contains(s.substring(i,j+1))){
                    list.add(s.substring(i,j+1));
                }
            }
        }
        return list;
    }

    public static boolean checkPalindrome(String a){
        int l =0; int r =a.length()-1;
        while(l<=r){
            if(a.charAt(l++) != a.charAt(r--))
                return false;
        }
        return true;
    }

}
