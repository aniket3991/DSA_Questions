package easy;

public class ValidPalindrom {
    public boolean isPalindrome(String s) {
        Boolean flag = true;
        s = s.toLowerCase();
        String newString = "";
        for(int i = 0; i < s.length(); i++) {
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
                newString += s.charAt(i);
        }

        for(int i = 0, j = newString.length() - 1; i < newString.length()/2; i++) {
            if(newString.charAt(i) != newString.charAt(j-i))
                flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        ValidPalindrom validPalindrom = new ValidPalindrom();
        System.out.println(validPalindrom.isPalindrome("0P"));
    }
}
