import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

public class test4April25 {
    public static void main(String[] args) {

        String input = "abc";
        Set<String> result = new LinkedHashSet<>();
        char[] arr = input.toCharArray();
        bT(result, arr, 0);
        for(String s: result)
            System.out.println(s);


        //next greater element
        int[] nums = {1,3,2,4};
        int[] res = nextGreaterElementMonotonicStack(nums);
        //int[] res = nextGreater(nums);n^2
        for(int i: res)
            System.out.print(i+",");
    }

    static int[] nextGreater(int[] nums){
        int[] max_till = new int[nums.length];
        max_till[nums.length-1] = -1;
        for(int i =0; i < nums.length -1 ;i++){
            for( int j =i+1; j <nums.length; j++){
                if(nums[j]>nums[i]){
                    max_till[i] = nums[j];
                    break;
                }
            }
        }
        return max_till;
    }

    static int[] nextGreaterElementMonotonicStack(int[] nums){
        int length = nums.length;
        int[] res = new int[length];
        Stack<Integer> stack = new Stack<>();
        for(int i = length-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i]){
                stack.pop();//we pop because in between smaller number :1, 3, 2, 4 ,eg 2 is insignificant for any number from 1 to 2 since 3 is greater than 2 and available
            }
            res[i] = stack.isEmpty()?-1:stack.peek();
            stack.push(nums[i]);
        }
        return res;
    }

    static void  bT(Set<String> result ,char[] arr,  int pos){
        if(pos==arr.length){
            String temp = String.valueOf(arr);
            result.add(temp);
            return;
        }
        for(int i=pos; i<arr.length; i++){
            swap(arr, pos, i);
            bT(result, arr, pos+1);
            swap(arr, pos, i);
        }
    }

    static void swap(char[] arr, int first_index, int second_index){
        if(second_index<arr.length){
            char temp = arr[first_index];
            arr[first_index] = arr[second_index];
            arr[second_index] = temp;
        }
    }
}
