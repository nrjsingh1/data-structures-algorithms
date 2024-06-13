package Interviews;

import java.util.ArrayList;
import java.util.List;

public class Test14Sep2021 {
    public static void main(String args[]) {
    
      //reverse data of an array
     int[] arr = {23, 2, 11, 13,  5, 17, 99};
     //11 9 6 5 3 1
     //3 5 6 9 11 1
     //11 9 6 5     3  1 
     //reverse(arr);
     
     //3 points(x,y) 1, 2, 3
     // check 2 in same line as 1 and 3
     
     
     //string - def -> all permutations of string
     // def, efd, dfe...
     String s = "def";
     listPermutations(s);
     
     /*
     
     hashMap - get -O(1)
     Arraylist -  get- O(1), add- O(1)
     set -  get - O(n)
     
     
     
     
     */
     
    }
    
    static void listPermutations(String s){
        int n = s.length();
        char[] arr = s.toCharArray();
        List<String> res = new ArrayList<>();
        for(int i =0;i<n;i++){
            recString(i, arr, new char[n], res );
        }
        for(String s1 : res)
            System.out.print(s1);
    }
    
    static void recString(int pos, char[] arr , char[] temp,  List<String> res){
        if(!res.contains(String.valueOf(temp))){
            res.add(String.valueOf(temp));
            return;
        }
        temp = arr;
        for(int i =0;i<arr.length && i != pos;i++){
            char tp = temp[i];
            temp[i] = temp[pos];
            temp[pos] = tp;
            recString(pos++, arr, temp, res);
        }
    }
    
    static boolean isMiddleInLine(int[] a, int[] b, int[] c ){
        // a[0] =x, a[1]= y
        /*
        0,1   x,1    2,1
        0,0  1,1  2,2
        
        dis(a,c) = dis(a,b)+ dis(b,c)
        */
        double disAB = Math.sqrt((a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]) );
        
        double disBC = Math.sqrt((c[0]-b[0])*(c[0]-b[0]) + (c[1]-b[1])*(c[1]-b[1]) );
        
        double disAC = Math.sqrt((a[0]-c[0])*(a[0]-c[0]) + (a[1]-c[1])*(a[1]-c[1]) );
        
        if( disAB + disBC == disAC)
            return true;
        else 
            return false;
        
    }
    
    static void reverse(int [] nums){
        int n = nums.length;
        int l =0;
        int r =n-1;
        while(l<=r){
            int temp=nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        for(int i:nums)
            System.out.print(i+" ");
    }
}
