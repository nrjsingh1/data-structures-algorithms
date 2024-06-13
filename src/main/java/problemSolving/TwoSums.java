package problemSolving;
import java.util.HashMap;
/*

sol 1- n^2
0   1   2   3   4   5
    1   2   3   4   5
0   1   2   3   4   5
0       2   3   4   5

 public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i =0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }

 SOl - 2 - O(n)
Hash Map
key , value -> nums[i], i
target - numns[i] = compl
map.contains(compl) should be true.

*/

class TwoSums {
    public static int[] twoSumBruteForce(int[] nums, int target) {
        int[] result = new int[2];
        for(int i =0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        throw new IllegalArgumentException("No Two Sums available");
    }

    public static int[] twoSumHashMap(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i =0; i <nums.length;i++){
            int compl = target - nums[i];
            if(map.containsKey(compl)){
                return new int[]{i , map.get(compl)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No Sums found Even in HashMap");
    }

    public static void main(String args[] ){
        int[] inputArray = {2,7,11,15, -1};
        int target = 18;
        int result[] = twoSumHashMap(inputArray, target);
        System.out.println("["+result[0]+","+result[1]+"]");
    }

}
