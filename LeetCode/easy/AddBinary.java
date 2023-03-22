package easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        /*String sum = "";
        String min = a.length() <= b.length() ? a : b;
        String max = b.length() >= a.length() ? b : a;

        int carry = 0;
        int i, j;
        for(i = min.length() - 1, j = max.length() - 1; i >= 0; i--,j--){

            Boolean aSign = min.charAt(i) == '1';
            Boolean bSign = max.charAt(j) == '1';

            if(carry == 0) {
                if(aSign ^ bSign)
                    sum += '1';
                else
                    sum += '0';
                if(min.charAt(i) == '1' && max.charAt(j) == '1')
                    carry = 1;
            }
            else {
                if(aSign ^ bSign)
                    sum += '0';
                else
                    sum += '1';
                if(min.charAt(i) == '0' && max.charAt(j) == '0')
                    carry = 0;
            }
        }
        for(; j >= 0; j--) {
            if(carry == 1){
                if(max.charAt(j) == '1')
                    sum += '0';
                else{
                    sum += '1';
                    carry = 0;
                }
            }
            else
                sum += max.charAt(j);
        }

        if(carry == 1)
            sum += '1';
        StringBuilder s = new StringBuilder(sum);
        sum = String.valueOf(s.reverse());

        return sum;*/

        StringBuilder sum = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        for(; i >= 0 || j >= 0 || carry == 1; i--,j--){
            if(i >= 0)
                carry += a.charAt(i) - '0';
            if(j >= 0)
                carry += b.charAt(j) - '0';
            sum.append(carry % 2);
            carry /= 2;
        }

        return sum.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary("1010","1011"));
    }
}
