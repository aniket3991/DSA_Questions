package easy;

public class MergeString {
    public String mergeAlternately(String word1, String word2) {
        int idx1 = 0;
        int idx2 = 0;
        char[] ans = new char[word1.length() + word2.length()];
        for(int i = 0; i < ans.length; i++) {
            if(idx1 < word1.length() && idx2 < word2.length()){
                if(i % 2 == 0)
                    ans[i] = word1.charAt(idx1++);
                else
                    ans[i] = word2.charAt(idx2++);
            } else if (idx1 < word1.length()) {
                ans[i] = word1.charAt(idx1++);
            }else ans[i] = word2.charAt(idx2++);
        }
        return String.valueOf(ans, 0, ans.length);
    }

    public static void main(String[] args) {
        MergeString mergeString = new MergeString();
        System.out.println(mergeString.mergeAlternately("abc", "pqr"));
    }
}
