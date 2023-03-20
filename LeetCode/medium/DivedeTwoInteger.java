package medium;

public class DivedeTwoInteger {
    public int divide(int dividend, int divisor) {
        int quetoient = 0;
        Boolean flag = false;
        Boolean flag2 = true;
        if(dividend == Integer.MIN_VALUE) {
        }
        if(dividend < 0 && divisor < 0) flag2 = false;

        if(dividend < 0) {
            dividend *= -1;
            flag = true;
        }
        if(divisor < 0) {
            divisor *= -1;
            flag = true;
        }

        if (dividend >= divisor) {
            while (dividend >= divisor) {
                dividend -= divisor;
                quetoient++;
            }
        }

        return flag && flag2 ? quetoient * -1 : quetoient;
    }

    public static void main(String[] args) {
        DivedeTwoInteger divedeTwoInteger = new DivedeTwoInteger();
        System.out.println(divedeTwoInteger.divide(1, 1));
    }
}
