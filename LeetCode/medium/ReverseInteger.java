package medium;

public class ReverseInteger {
    public int reverse(int x) {
        int reverse = 0;

        while(x != 0) {
            int rem = x % 10;
            if (reverse > 214748364 || reverse < -214748364)
                return 0;
            reverse = reverse * 10 + rem;
            x /= 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(1534236469));
    }
}
