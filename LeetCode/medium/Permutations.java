package medium;

import java.util.List;
import java.util.ArrayList;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public void backtracking(int[] nums, int idx, List<Integer> res, List<List<Integer>> result) {
        if(idx == nums.length)
            result.add(new ArrayList<>(res));

        for(int i = idx; i < nums.length; i++) {
            res.add(nums[i]);
            swap(nums, idx, i);
            backtracking(nums, idx + 1, res, result);
            swap(nums, idx, i);
            res.remove(res.size() - 1);
        }
    }

    public void swap(int[] nums, int idx, int i) {
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }

    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        int[] arr = {1,2};
        List<List<Integer>> list = permutations.permute(arr);

        for(List<Integer> l : list){
            System.out.println(l);
            System.out.println();
        }
    }
}
