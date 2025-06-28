package problemSolving.recursion;
//
//Letter Combinations of a Phone Number
//Solved
//        Medium
//
//Topics
//        Companies
//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
//
//A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelePhoneLetterCombination {
    public static void main(String[] args) {
        int[] digits ={2,3};
        Map<Integer, String> map = new HashMap<>(){{
            put(0,"");
            put(1,"");
            put(2,"a,b,c");
            put(3,"d,e,f");
            put(4,"g,h,i");
            put(5,"j,k,l");
            put(6,"m,n,o");
            put(7,"p,q,r,s");
            put(8,"t,u,v");
            put(9,"w,x,y,z");
        }};
        List<List<String>> res = new ArrayList<>();

    }
   /// static void letterCombRecur(List<List<String>> res, Map<Integer, String> map, )
}
