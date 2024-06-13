package Interviews;

public class Test6Aug {

    public static void main(String[] args) {

        /*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
Input: s = "()[]{}"
Output: true

Input: s = "([)]"
Output: false
        * */
//        String s = "(){{";
//        Stack<Character> stk = new Stack<>();
//        Map<Character, Character> map = new HashMap<>();
//        map.put(')', '(');
//        map.put(']', '[');
//        map.put('}', '{');
//
//        for(char c : s.toCharArray()){
//            if(c == '(' ||c == '[' || c == '{' )
//                stk.push(c);
//            else{
//                char mO = map.get(c);
//                char sT = stk.pop();
//                if(sT != mO){
//                    System.out.println("False");
//                    return;
//                }
//
//            }
//        }
//        if(!stk.isEmpty())
//            System.out.println("False");
//        else
//            System.out.println("True");



//        Stock Buy Sell to Maximize Profit
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Buy on Day 1 and sell on day 2  - 4
//        Buy On day 3 and Sell on day 6 - 3
//        Total profit - 7
int [] prices = {7,1,5,3,6,4};
System.out.println(findMaxProfit(prices));

    }

    public static int findMaxProfit(int [] arr){
        int [] sP = new int[arr.length];
        sP[0]=0;
        int maxDiff =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            min = Math.min(min, arr[i]);
            maxDiff  = Math.max(maxDiff, arr[i]-min);
        }
        return maxDiff;
    }


//
//    Map<String,Employee>
//    Map<Employee, String>
//    immutable

}
