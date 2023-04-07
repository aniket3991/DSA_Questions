package medium;

public class CointnerWithMaxWater {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int area = 0;
        
        while(start < end){
            int h = height[start] < height[end] ? height[start] : height[end];
            int tempArea = h * (end - start);
            if(tempArea > area)
                area = tempArea;
            
            if(height[start] < height[end])
                start++;
            else
                end--;
            while(height[start] <= h && start < end) start++;
            while(height[end] <= h && end > start) end--;
        }
        return area;
    }
    public static void main(String[] args) {
        CointnerWithMaxWater cointnerWithMaxWater = new CointnerWithMaxWater();
        int[] height = {5,10,1,1,1,1,1,1,1,10,5};
        System.out.println(cointnerWithMaxWater.maxArea(height));
    }
}
