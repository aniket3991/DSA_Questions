package medium;

import java.awt.BorderLayout;
import java.util.Arrays;

public class MaximumInBoat {
    public int numRescueBoats(int[] people, int limit) {
        int boat = 0;
        Arrays.sort(people);
        
        int start = 0;
        int end = people.length - 1;
        
        while(start <= end) {
            boat++;
            if(people[start] + people[end] <= limit)
                start++;
            end--;
        }
        return boat;
    }
    public static void main(String[] args) {
        MaximumInBoat maximumInBoat = new MaximumInBoat();
        int[] arr = {3,8,7,1,4};
        System.out.println(maximumInBoat.numRescueBoats(arr, 9));
    }
    
}
