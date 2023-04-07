package easy;

public class ArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] newNums = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            newNums[i] = nums[nums[i]];
        }
        return newNums;
    }
    public static void main(String[] args) {
        ArrayFromPermutation arrayFromPermutation = new ArrayFromPermutation();
        int[] arr = {0,2,1,5,3,4};
        int[] newArr = arrayFromPermutation.buildArray(arr);
        for(int i: newArr)
            System.out.print(i + " ");
        System.out.println();
    }
}
