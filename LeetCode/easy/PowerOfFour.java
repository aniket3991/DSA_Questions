package easy;

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        if(n == 0) return false;
        if((double)n/4 == 1) return true;

        return n%4 == 0 && isPowerOfFour(n/4);
    }

    public static void main(String[] args) {
        PowerOfFour powerOfFour = new PowerOfFour();
        System.out.println(powerOfFour.isPowerOfFour(0));
    }
}
