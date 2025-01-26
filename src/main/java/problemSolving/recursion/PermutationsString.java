package problemSolving.recursion;

import java.util.LinkedHashSet;
import java.util.Set;

//permutations of a string using swap
class PermutationsString {
    public static void main(String[] args) {
        
        String s = "abc";
        Set<String> res = new LinkedHashSet<>();//new ArrayList<>();
        char[] arr = s.toCharArray();
        permuteBT(res, arr, 0);
        
        for(String temp:res)
            System.out.println(temp);
    }
    
    static void permuteBT(Set<String> res,  char[] arr, int pos){
        if(pos==arr.length-1){
            String temp = String.valueOf(arr);
            res.add(temp);
            return;
        }
        
        for(int i =pos;i<arr.length;i++){
            swap(pos, i, arr);// fixed first char pos and swaped it with other chars i
            permuteBT(res, arr, pos+1);
            swap(pos, i, arr);// undo the swap to back track to the parent of all child combinations when first chars are set
        }
    }
    
    static void swap(int l, int r , char[] arr){
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    
    
    
}
