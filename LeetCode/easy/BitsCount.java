package easy;

public class BitsCount {
    public int hammingWeight(int n) {
        String res = Integer.toBinaryString(n);
        res = res.replace("0","");
        return res.length();
    }

    public static void main(String[] args) {
        BitsCount bitsCount = new BitsCount();
        System.out.println(bitsCount.hammingWeight(11));
    }
}
