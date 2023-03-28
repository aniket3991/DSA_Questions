package medium;

public class StringToInteger {
    public int myAtoi(String s) {
        /*char sign = '+';
        int digitCount = 0;
        boolean hasZero = true;
        String number = "0";
        s = s.strip();

        if(s.length() == 0)
            return 0;

        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            sign = s.charAt(0);
            s = s.substring(1);
        }

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0' && hasZero) {
            }
            else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                number += s.charAt(i);
                hasZero = false;
                digitCount++;
            }
            else
                break;
            if(digitCount > 10)
                break;
        }
        long num = sign == '-' ? Long.parseLong(number) * -1 : Long.parseLong(number);

        if(num > 2147483647)
            return Integer.MAX_VALUE;
        if(num < -2147483648)
            return Integer.MIN_VALUE;
        return (int)num;*/
        s = s.trim();

        if(s.length() == 0) return 0;

        long number = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(i == 0 && (ch == '-' || ch == '+')) continue;
            else if(ch >= '0' && ch <= '9') {
                number = (number * 10) + (ch - '0');
            }else {
                break;
            }
            if(number > Integer.MAX_VALUE || number < Integer.MIN_VALUE)
                break;
        }
        if(s.charAt(0) == '-') number = -number;
        if(number > Integer.MAX_VALUE || number < Integer.MIN_VALUE)
            return number < Integer.MIN_VALUE ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        return (int) number;

    }

    public static void main(String[] args) {
        StringToInteger stringToInteger = new StringToInteger();
        System.out.println(stringToInteger.myAtoi("    00012345678      "));
    }
}
