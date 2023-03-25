package easy;

import java.util.Hashtable;
import java.util.Map;

public class GoodPair {
    public int numIdenticalPairs(int[] nums) {
        /*int count = 0;

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j])
                    count++;
            }
        }
        return count;*/
        int count = 0;
        Map<Integer, Integer> pair = new Hashtable<>();
        for(int i = 0; i < nums.length; i++) {
            if(pair.containsKey(nums[i])){
                count += pair.get(nums[i]);
                pair.put(nums[i], pair.get(nums[i]) + 1);
            }
            else
                pair.put(nums[i], 1);
        }
        return count;
    }

    public static void main(String[] args) {
        GoodPair goodPair = new GoodPair();
        int[] arr = {1,1,1,1};
        System.out.println(goodPair.numIdenticalPairs(arr));
    }
}
