package problemSolving.recursion;

import java.util.ArrayList;
import java.util.List;

//link:https://leetcode.com/problems/subsets/solutions/5525998/video-we-have-two-choices-for-each-number
public class subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3,};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        //createSubset(nums, 0, res, subset);
        backtrack(res, subset, nums, 0);
        for (List<Integer> item: res)
            System.out.println(item);
    }


    //✅ Advantage: Uses a single recursive call per iteration, reducing stack space usage.
    //⚡ More optimized because it avoids unnecessary calls.
    private static void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
        result.add(new ArrayList<>(temp)); // Store the current subset
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]); // Choose the element
            backtrack(result, temp, nums, i + 1); // Recur for next elements
            temp.remove(temp.size() - 1); // Backtrack (remove last element)
        }
    }


    //✅ Advantage: Clearly models the “include or exclude” decision process.
    //❌ Downside: Generates more recursive calls, leading to higher stack usage.
    static void createSubset(int[] nums, int index, List<List<Integer>> res, List<Integer> subset) {
        if (index == nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        createSubset(nums, index + 1, res, subset);

        subset.remove(subset.size() - 1);
        createSubset(nums, index + 1, res, subset);
    }
}