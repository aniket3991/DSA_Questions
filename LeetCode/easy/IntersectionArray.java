package easy;

import java.util.*;

public class IntersectionArray {
    public int[] intersect(int[] nums1, int[] nums2) {
        /*Map<Integer, Integer> map = new Hashtable<>();
        Map<Integer, Integer> map1 = new Hashtable<>();
        List<Integer> list = new ArrayList<>();

        for(int i: nums1){
            if(map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else map.put(i, 1);
        }
        for(int i: nums2){
            if(map1.containsKey(i))
                map1.put(i, map1.get(i) + 1);
            else map1.put(i, 1);
        }
        for(int key: map.keySet()){
            if(map1.containsKey(key)){
                int l = Math.min(map.get(key), map1.get(key));
                while(l > 0){
                    list.add(key);
                    l--;
                }
            }
        }
        int[] arr = new int[list.size()];
        for(int i = 0; i < arr.length; i++)
            arr[i] = list.get(i);
        return arr;*/
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<>();
        int nums1Idx = 0;
        int nums2Idx = 0;

        while(nums1Idx < nums1.length && nums2Idx < nums2.length) {
            if(nums1[nums1Idx] == nums2[nums2Idx]){
                list.add(nums1[nums1Idx]);
                nums1Idx++;
                nums2Idx++;
            }else if(nums1[nums1Idx] > nums2[nums2Idx])
                nums2Idx++;
            else nums1Idx++;
        }
        int[] arr = new int[list.size()];
        for(int i = 0; i < arr.length; i++)
            arr[i] = list.get(i);
        return arr;
    }

    public static void main(String[] args) {
        IntersectionArray intersectionArray = new IntersectionArray();
        int[] arr = {1,2,2,1};
        int[] arr2 = {2,2};
        int[] arr3 = intersectionArray.intersect(arr, arr2);

        for(int i : arr3)
            System.out.print(i + " " );
        System.out.println();
    }
}
