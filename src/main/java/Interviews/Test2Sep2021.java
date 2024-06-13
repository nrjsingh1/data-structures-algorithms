package Interviews;

import java.util.Arrays;

public class Test2Sep2021 {
    public static void main(String[] args) {

        int[] arr = {12, 3, 4, 1, 6, 9};
        int target = 24;
        findTriplet(arr, target);

        /*For example if the first linked list a is 5->10->15 and the other linked list b is 2->3->20, then SortedMerge()
         should return a pointer to the head node of the merged list 2->3->5->10->15->20.
         2->3->5->10->15->20
        * */

    }

    static void findTriplet(int[] arr, int target) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int l = 0; //arr[0];
            int r = arr.length - 1; //arr[arr.length-1];
            int rem = target - arr[i];
            while (l < r) {
                if (arr[l] + arr[r] == rem) {
                    System.out.print(arr[l] + " " + arr[r] + " " + arr[i]);
                    return;
                } else if (arr[i] < rem) l++;
                else if (arr[i] > rem) r--;
            }

        }
    }

//    static Node mergeLinkedLists(Node l1, Node l2){
//        LinkedList l3 = new LinkedList();
//        Node cur = l3.head;
//        while(l1!=null || l2!=null){
//            if(l1.val <= l2.val){
//                cur.next  = l1;
//                Node temp = l1;
//                l1 = l1.next;
//                temp.next = null;
//            }
//            else {
//                cur.next = l2;
//                Node temp = l2;
//                l2 = l2.next;
//                temp.next = null;
//            }
//        }
//        if(l1==null){
//            cur.next = l2;
//        }
//        if(l2==null){
//            cur.next =l1;
//        }
//        return l3.head;
//    }

}
