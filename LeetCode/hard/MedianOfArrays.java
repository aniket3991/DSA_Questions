package hard;

import java.util.Arrays;

public class MedianOfArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;
        int size3 = size1 + size2;
        int mid = size3/2;
        int[] nums3 = new int[size3];

        for(int i = 0; i < size1; i++) {
                nums3[i] = nums1[i];
        }
        for(int i = size1; i < size3; i++) {
            nums3[i] = nums2[i - size1];
        }
        Arrays.sort(nums3);

        if(size3 % 2 == 0)
            return (float)(nums3[mid-1] + nums3[mid])/2;
        else
            return (float) nums3[mid];
    }
    public static void main(String[] args) {
        MedianOfArrays m = new MedianOfArrays();
        int[] a = {1,3};
        int[] b = {2};
        System.out.println(m.findMedianSortedArrays(a,b));
    }
}
