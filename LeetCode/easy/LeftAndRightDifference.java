package easy;

import java.util.Arrays;

public class LeftAndRightDifference {
    public int[] leftRigthDifference(int[] nums) {
        
        int[] answer = new int[nums.length];
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        
        int sumLeft = Arrays.stream(nums).sum();
        int sumRight = sumLeft;
        
        /*for(int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            
            if(i > nums.length/2){
                if(i != nums.length -1){
                    for(int j = i+1; j < nums.length; j++)
                        rightSum += nums[j];
                }
                leftSum = sum - nums[i] - rightSum;
            }else{
                if(i != 0){
                    for(int j = i - 1; j >= 0; j--)
                        leftSum += nums[j];
                }
                rightSum = sum - nums[i] - leftSum;
            }
            
            answer[i] = Math.abs(leftSum - rightSum);
        }*/
        
        for(int i = 0; i < nums.length; i++) {
            rightSum[i] = sumRight - nums[i];
            sumRight -= nums[i];
        }
        for(int i = nums.length - 1; i >= 0; i--) {
            leftSum[i] = sumLeft - nums[i];
            sumLeft -= nums[i];
        }
        for(int i = 0; i < nums.length; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        
        return answer;
    }
    public static void main(String[] args) {
        LeftAndRightDifference lard = new LeftAndRightDifference();
        int[] arr = {10,4,8,3};
        int[] ans = lard.leftRigthDifference(arr);        
        for(int i: ans){
            System.out.print(i + " ");
        }
    }
}
