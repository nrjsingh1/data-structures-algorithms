package problemSolving.recursion;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/subsets/solutions/5525998/video-we-have-two-choices-for-each-number
public class subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        createSubset(nums, 0, res, subset);
        for (List<Integer> item: res)
            System.out.println(item);
    }

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