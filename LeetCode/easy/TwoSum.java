package easy;

import java.util.Hashtable;
import java.util.Map;

public class TwoSum {
    public int[] towSum(int[] nums, int target){
        Map<Integer, Integer> map = new Hashtable<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i]))
                return new int[] {map.get(target - nums[i]), i};
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        TwoSum twoSum = new TwoSum();
        arr = twoSum.towSum(arr, 6);
        for(int i: arr)
            System.out.println(i);
    }
}
