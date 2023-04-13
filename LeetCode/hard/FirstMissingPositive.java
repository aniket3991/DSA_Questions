package hard;

import java.util.Arrays;

public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int x = 1;
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == x)
                x++;
        }
        return x;
    }
    

    public static void main(String[] args) {
        FirstMissingPositive fmp = new FirstMissingPositive();
        int[] nums = {0,2,2,2,3,4,4,1,1};
        System.out.println(fmp.firstMissingPositive(nums));
    }
}
