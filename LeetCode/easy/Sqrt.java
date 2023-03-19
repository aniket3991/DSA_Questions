package easy;

public class Sqrt {
    public int mySqrt(int x) {
        if(x < 2)
            return x;
        //long result = 1;
        for(long result = 2; result <= 46341; result++) {
            if(result * result == x)
                return (int)result;

            if(result * result > x)
                return (int)--result;
        }
        return 0;
    }
    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        System.out.println(sqrt.mySqrt(8));
    }
}
