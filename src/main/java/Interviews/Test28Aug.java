package Interviews;

//import java.util.Queue;
//import java.util.WeakHashMap;
//
//class TreeNode{
//    TreeNode root;
//    TreeNode left;
//    TreeNode right;
//}


public class Test28Aug {
    public static void main(String[] args) {
//        //abaa
//        System.out.println(findPalindromes("abaa"));
//        //a b aba aa a a

        /* BST - 3,1,4,null,2
        k = 2 - 2
        k=1,1

        *
        *
        *
        *
        * */

        //#2 aaaabcbcbcdefdefdef
        //   a4bc3def3 - compressed string is given , with index , find the char at that index in the non compressed string

        /*
        *
        * aaaaabcbcbc def  def  ghghghgh
01234567890123 456 7890

Input
a5bc3def2gh4 -->input    defdef - 6
                 16- 11 = 5
                17-17 =0 +1 =g
Index → int

Bc10
Bcbcbc bcbcbcbc bc
15
0
15%2 = 1
8 → c
15 → e
17 -> g

Char findChar(String s, int index){

Int preSum = 0;
    for(int i =0;i<s.length();i++){
        String curS = “”;
Int curLength = 0;
    Int curNum = 0;

        if(s.charAt(i)>=’0’ && s.charAt(i)<=’9’){
curNum = Integer.valueOf(S.charAt(i));
curLength  =  curNum * curS.length();
}else{
    curS = curS+s.charAt(i);
}

if( preSum > = index){
//Int mod = (index -oldSum) % curS.length(); // Is it index % len?

Return curS.charAt(mod);
}else{
    oldSum = preSum;
    preSum  = preSum + curLength;
}

    }


}

//}

        * */
    }
   /* static TreeNode findSmallest(TreeNode root, int counter,int  k){

        if(root ==null)
            return null;

        else{
            while(root!=null && counter !=k){
                if(root.left!=null) findSmallest(root.left, ++counter, k);
                else if(root.right !=null){
                    return root.right;
                }
                else return  root;

            }
        }
        return root;
    }*/

//    static int findPalindromes(String s){
//        int count =0;
//        for(int i =0;i<s.length();i++){
//            for(int j = i+1;j<=s.length();j++){
//                //char [] temp =
//                if(isPalindrome(s.substring(i,j))){
//                    count++;
//                    System.out.println(s.substring(i,j));
//                }
//
//            }
//        }
//        return count;
//    }
//
//    static boolean isPalindrome(String s){
//        //aabbaa
//        //aba
//        int l = 0;
//        int r = s.length()-1;
//        while(l<r){
//            if(s.charAt(l)==s.charAt(r)){
//                l++;
//                r--;
//            }else
//                return false;
//        }
//        return true;
//    }
}
