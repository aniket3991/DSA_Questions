package GFG;

public class SubArraysOfZeros {
    long noOfSubarrays(int N, int [] arr) {
        long subArray = 0;
        int countZero = 0;
        for(int i = 0; i < N; i++) {
            if(arr[i] == 0) {
                countZero++;
                subArray += countZero;
            }
            else {
                countZero = 0;
            }
        }
        return subArray;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0};
        SubArraysOfZeros subArraysOfZeros = new SubArraysOfZeros();
        System.out.println(subArraysOfZeros.noOfSubarrays(4, arr));
    }
}
