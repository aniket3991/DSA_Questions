package easy;

// using binary search
public class Sqrt {
    public int mySqrt(int x) {
        long low = 1;
        long high = x;

        while(low <= high) {
            long mid = (low + high)/2;

            if(mid * mid == x)
                return (int)mid;
            else if(mid * mid > x)
                high = mid - 1;
            else 
                low = mid + 1;
        }
        return (int)low - 1;
    }
    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        System.out.println(sqrt.mySqrt(8));
    }
}
