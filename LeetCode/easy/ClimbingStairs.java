
package easy;

public class ClimbingStairs {
    public int climbStairs(int n) {
     int twos = 0;
     int ones = n;
     int possibleWays = 0;
     
     for(int i = 0; i <= n/2; i++){
         int remain = ones + twos;
         int max = Math.max(ones, twos);
         long totalPermutation = pro(remain - max, remain);
         possibleWays += (int)totalPermutation;
         twos++;
         ones -= 2;
     }
     return possibleWays;
    }
    
    public long pro(int min, int num) {
        long product = 1;
        long forMin = 1;
        for(int i = 1; i <= min; i++){
            product *= num--;
            if(product % i == 0)
                product /= i;
            else
                forMin *= i;
        }
        return product/forMin;
    }
    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(44));
    }
}
