package easy;

public class BitsCount {
    public int hammingWeight(int n) {
        int count = 0;

        while(n != 0) {
            int lastBit = n & 1;
            count += lastBit;
             n >>>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        BitsCount bitsCount = new BitsCount();
        System.out.println(bitsCount.hammingWeight(-2));
    }
}
