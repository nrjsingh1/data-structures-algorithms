package Interviews;

import java.util.HashMap;
import java.util.Map;

public class Test19Feb {

    /*
    *
    *
    * # Generate permutations of the string
    # Input: "abc"
    # Output: "abc", "acb", "bca", "bac", "cab", "cba"*/


//    # Generate the message from the integer stream, based on the number mapping in mobile num keypads
//# for example 1 is mapped with "abc", 2 is mapped with "def" and so on
    /*1- abc
    2- def
    3-ghi
    4-jkl
    5-mno
    6-pqr
    7-stu
    8-vw
    9-xy
    0-z

    * */
//            # Input: 1122
//            # Output: "be"
//            # Input: 11112222
//            # Output: "ad"
//            # Input: 121
//            # Output: "ada"


    public static String convertIntegerStreamToMessage(String input) {
        Map<Character, String> numberMap = new HashMap<>();
        numberMap.put('1', "abc");
        numberMap.put('2', "def");
        numberMap.put('3', "ghi");
        numberMap.put('4', "jkl");
        numberMap.put('5', "mno");
        numberMap.put('6', "pqr");
        numberMap.put('7', "stu");
        numberMap.put('8', "vw");
        numberMap.put('9', "xy");
        numberMap.put('0', "z");
        StringBuilder res = new StringBuilder();
        int prevCount = 1;
        int cur = 1;
        int prev = 0;
        while (cur <= input.length()) {
            if (cur == input.length() - 1) {
                int charIndex = prevCount % numberMap.get(input.charAt(prev)).length() - 1;
                res.append(numberMap.get(input.charAt(prev)).charAt(charIndex));
                break;
            } else if (input.charAt(cur) == input.charAt(prev)) {
                prev = cur;
                prevCount++;
                cur++;
            } else {
                int charIndex = prevCount % numberMap.get(input.charAt(prev)).length() - 1;
                res.append(numberMap.get(input.charAt(prev)).charAt(charIndex));
                prev = cur;
                prevCount = 1;
                cur++;
            }

        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertIntegerStreamToMessage("11112222"));
    }
}
