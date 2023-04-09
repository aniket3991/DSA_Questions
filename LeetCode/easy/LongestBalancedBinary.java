package easy;

public class LongestBalancedBinary {
    public int findTheLongestBalancedSubstring(String s) {
        int count = 0;
        int tempCount = 0;
        int balance = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0'){
                balance--;
            }else {
                if(s.charAt(i) == '1' && balance == 0)
                    continue;
                while(balance < 0 && i < s.length() && s.charAt(i) == '1' ) {
                    balance++;
                    tempCount++;
                    i++;
                }
                i--;
                count = Math.max(count, tempCount);
                tempCount = 0;
                balance = 0;
            }
        }
        return 2 * count;
    }
    public static void main(String[] args) {
       LongestBalancedBinary lbb = new LongestBalancedBinary();
        System.out.println(lbb.findTheLongestBalancedSubstring("001011"));
    }
}
