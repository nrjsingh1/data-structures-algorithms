package problemSolving.recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationInclusion {
    public static void main(String[] args) {
        String s1 = "trinitrophenylmethylnitramine";
        String s2 = "dinitrophenylhydrazinetrinitrophenylmethylnitramine";

        char[] arr = s1.toCharArray();
        int pos = 0;
        //Boolean res = false;
        //String res = "_";
        List<String> res = new ArrayList<>();
        permute(0, arr, s2, res);
        System.out.println(res);
        System.out.println( !res.isEmpty() && s2.contains(res.get(0)));
    }

    //boolean variable does not remember older states of recursion
    //String variable does not remember older states of recursion


//    static  boolean checkInclusion(String s1, String s2){
//        if(s1.length()>s2.length())
//            return false;
//
//    }

    static void permute(int pos, char[] arr, String s2, List<String> res) {
        if (pos == arr.length - 1) {
            String temp = String.valueOf(arr);
            if (s2.contains(temp)){
                res.add(temp);
                return;
            }

        }
        for (int i = pos; i < arr.length; i++) {
            swap(pos, i, arr);
            permute(pos + 1, arr, s2, res);
            swap(pos, i, arr);
        }
    }

    static void swap(int l, int r, char[] arr) {
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}