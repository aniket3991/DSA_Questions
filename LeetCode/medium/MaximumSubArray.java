package medium;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int subArray = 0;

        for(int i: nums){
            subArray += i;
            if(max < subArray)
                max = subArray;

            if(subArray < 0)
                subArray = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubArray.maxSubArray(arr));
    }
}
