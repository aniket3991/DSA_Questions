package hard;

public class MedianOfArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int first = 0;
        int second = 0;

        int total = nums1.length + nums2.length;
        int p1 = 0;
        int p2 = 0;

        for(int i = 0; i <= total/2; i++) {
            first = second;

            if(p1 < nums1.length && p2 < nums2.length) {
                if(nums1[p1] < nums2[p2]){
                    second = nums1[p1];
                    p1++;
                }
                else {
                    second = nums2[p2];
                    p2++;
                }
            }
            else if(p1 < nums1.length) {
                second = nums1[p1];
                p1++;
            }
            else {
                second = nums2[p2];
                p2++;
            }
        }
        if(total % 2 == 1)
            return (double) second;
        return ((double) first + (double) second)/2;
    }

    public static void main(String[] args) {
        MedianOfArrays medianOfArrays = new MedianOfArrays();
        int[] arr1 = {1,3};
        int[] arr2 = {2};
        System.out.println(medianOfArrays.findMedianSortedArrays(arr1, arr2));
    }
}
