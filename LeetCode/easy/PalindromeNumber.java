package easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int copy = x;
        int rev = 0;

        while(x != 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        return rev == copy;
    }
    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(-121));
    }
}
