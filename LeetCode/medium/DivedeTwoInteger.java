package medium;

public class DivedeTwoInteger {
    public int divide(int dividend, int divisor) {
        int quotient = 0;

        if(dividend == 1 << 31 && divisor == -1) return Integer.MAX_VALUE;

        Boolean sign = (dividend > 0) == (divisor > 0);

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while (dividend - divisor >= 0) {
            int count = 0;

            while (dividend - (divisor << 1 << count) >= 0) {
                count++;
            }

            quotient += 1 << count;
            dividend -= divisor << count;
        }

        return sign ? quotient : -quotient;
    }

    public static void main(String[] args) {

        DivedeTwoInteger divedeTwoInteger = new DivedeTwoInteger();

        System.out.println(divedeTwoInteger.divide(123, -9));
    }
}
