package medium;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int distance = Integer.MAX_VALUE;
        int result = 0;

        for(int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(sum - target) < distance) {
                    distance = Math.abs(sum - target);
                    result = sum;
                }
                if(sum == target) return sum;
                if(sum > target) k--;
                else j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        int[] nums = {-1, 2, 1, -4}; // -4, -1, 1 ,2
        System.out.println(threeSumClosest.threeSumClosest(nums, 1));
    }
}
