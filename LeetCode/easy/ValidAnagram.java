package easy;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        boolean flag = true;
        int sSize = s.length();
        int tSize = t.length();

        int[] sArr = new int[26];
        int[] tArr = new int[26];

        if(sSize != tSize) return false;

        for(int i = 0; i < sSize; i++){
            sArr[s.charAt(i) - 'a']++;
            tArr[t.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(sArr[i] != tArr[i]){
                flag = false;
                break;
            }

        }
        return flag;
    }

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("rat","car"));
    }
}
