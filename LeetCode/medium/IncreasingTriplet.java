package medium;

public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        int length = nums.length;
        if (length < 3) return false;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= first)
                first = nums[i];
            else if(nums[i] <= second)
                second = nums[i];
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        IncreasingTriplet increasingTriplet = new IncreasingTriplet();
        int[] arr = {2,1,5,0,4,6};
        System.out.println(increasingTriplet.increasingTriplet(arr));
    }
}
