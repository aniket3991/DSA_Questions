package medium;

public class DivideTwoInteger {
    /*public int divide(int dividend, int divisor) {
        if (dividend == divisor) {
            return 1;
        }

        if (dividend == -2147483648 && divisor == -1) {
            return (2147483647);
        }
        if (dividend == -2147483648 && divisor == 1) {
            return (-2147483648);
        }

        if (dividend < 0 & divisor < 0 & divisor < dividend) {
            return 0;
        }

        if (divisor > 0 & dividend > 0 & divisor > dividend) {
            return 0;
        }

        int remains = 0;

        if (dividend == Integer.MIN_VALUE) {
            dividend += 1;
            remains = -1;
        }

        if (divisor == Integer.MIN_VALUE) {
            return 0;
        }


        int prefiks = (((dividend < 0 & divisor > 0) || (dividend > 0 & divisor < 0)) ? -1 : 1);


        dividend = (dividend < 0) ? -dividend : dividend;
        divisor = (divisor < 0) ? -divisor : divisor;

        if (divisor > dividend) {
            return 0;
        }


        int sizeMemory = calcMemorySize(dividend, divisor);
        int[] memory = fillMemory(divisor, sizeMemory);

        return calcResult(memory, prefiks, dividend, divisor, remains);
    }

    private int calcMemorySize(int dividend, int divisor) {
        int lengthDividend = String.valueOf(dividend).length();
        int lengthDivisor = String.valueOf(divisor).length();
        int result = lengthDividend - lengthDivisor + 1;
        if (result > 5) {
            result += 4096;
        }
        if (result > 4) {
            result += 2048;
        }
        if (result > 3) {
            result += 1024;
        }
        if (result > 2) {
            result += 16;
        }
        return result;

    }

    private int calcResult(int[] memory, int prefiks, int dividend, int divisor, int remains) {
        int result = 0;

        if (divisor == 1) {
            return prefiks < 0 ? -dividend : dividend;
        }

        if (divisor == dividend) {
            return prefiks < 0 ? -1 : 1;
        }

        if (remains == -1) {
            dividend -= memory[memory.length - 1];
            dividend += 1;
            result += memory.length;
        }

        for (; dividend > divisor; ) {
            for (int j = memory.length - 1; j >= 0; j--) {
                for (; memory[j] <= dividend; ) {
                    result += j + 1;
                    dividend -= memory[j];
                }
            }
        }
        return prefiks < 0 ? -result : result;
    }

    private int[] fillMemory(int divisor, int sizeMemory) {
        int[] memory = new int[sizeMemory];
        int accuum = 0;
        for (int i = 0; i < memory.length; i++) {
            accuum += divisor;
            memory[i] += accuum;
        }
        return memory;
    }*/
    public int divide(int dividend, int divisor) {
        int quotient = 0;
        if (dividend == 1 << 31 && divisor == -1) return Integer.MAX_VALUE;
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
        int a = 1;
        DivideTwoInteger divideTwoInteger = new DivideTwoInteger();
        System.out.println(divideTwoInteger.divide(2147483647,-1));
    }
}
