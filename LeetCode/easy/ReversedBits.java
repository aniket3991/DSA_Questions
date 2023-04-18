package easy;

public class ReversedBits {
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        sb.reverse();

        for(int i = sb.length(); i < 32; i++){
            sb.append('0');
        }
        return Integer.parseInt(sb.toString(),2);
    }

    public static void main(String[] args) {
        ReversedBits reversedBits = new ReversedBits();
        System.out.println(reversedBits.reverseBits(-3));
    }
}
