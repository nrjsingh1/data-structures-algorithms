package Interviews;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
        }
public class Test3Sep2021 {
    public static void main(String[] args) {
        //a b c a b c c a b c d
        //longest substring without duplicates

    }
    public static String longestUniqueSubstring(String s){

        List<List<Character>> list = new ArrayList<>();

        for(int i =0;i<s.length();i++){
            List<Character> chars = new ArrayList<>();
            for(int j =i;j<s.length();j++){
                if(chars.contains(s.charAt(j)))
                    break;
                else
                    chars.add(s.charAt(j));
            }
            list.add(chars);
        }
        int max =0;
        for(List l:list){
            max = Math.max(max, l.size());
        }
        for(List l:list){
            if(l.size() == max)
                return String.valueOf(l);
        }
        return  null;
    }

    public void inOrder(TreeNode root){

        if(root.left!=null) inOrder(root.left);
        System.out.println(root.data);
        if(root.right!=null)inOrder(root.right);
    }

    public void preOrder(TreeNode root){

        System.out.println(root.data);
        if(root.left!=null) preOrder(root.left);
        if(root.right!=null)preOrder(root.right);
    }

    public void postOrder(TreeNode root){

        if(root.left!=null) postOrder(root.left);
        if(root.right!=null)postOrder(root.right);
        System.out.println(root.data);
    }
}
