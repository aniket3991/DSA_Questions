package easy;

public class FibonacciNumber {
    public int fib(int n) {
        // using recursion
        /*if(n == 0) return 0;
        if(n == 1) return 1;

        return fib(n - 1) + fib(n - 2);*/

        // using for loop
        if(n < 2) return n;

        int first = 0;
        int second = 1;

        for(int i = 2; i <= n; i++) {
            int temp = first;
            first = second;
            second = temp + second;
        }

        return second;
    }

    public static void main(String[] args) {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        System.out.println(fibonacciNumber.fib(4));
    }
}
