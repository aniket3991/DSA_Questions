package medium;

public class PowCalculation {
    public double myPow(double x, int n) {
        /*double result = 1;
        boolean sign = true;
        if(x == 1) return 1;

        if(x == -1) {
            if(n == Integer.MIN_VALUE) return 1;

            if(n % 2 == 0) return 1;
            else return -1;
        }

        if(n == Integer.MIN_VALUE) return 0;
        if(n < 0)
            sign = false;
        n = Math.abs(n);

        for(int i = 0; i < n; i++)
            result *= x;
        return sign ? result : 1/result;*/

        if(n == 0 || x ==1)
            return 1;
        if(n < 0)
            return myPow(1/x, Math.abs(n));
        return n % 2 == 0 ? myPow(x * x, n/2) : x * myPow(x * x, n/2);
    }

    public static void main(String[] args) {
        PowCalculation powCalculation = new PowCalculation();
        System.out.println(powCalculation.myPow(10,2));
    }
}
