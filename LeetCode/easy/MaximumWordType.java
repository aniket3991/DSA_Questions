package easy;

import java.util.HashSet;
import java.util.Set;

public class MaximumWordType {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> badKey = new HashSet<>();
        int count = 0;
        for(char a : brokenLetters.toCharArray())
            badKey.add(a);
        
        String[] words = text.split(" ");
        for(String word : words){
            for(int i = 0; i < word.length(); i++) {
                if(badKey.contains(word.charAt(i)))
                    break;
                else if(i == word.length() - 1)
                    count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        MaximumWordType maximumWordType = new MaximumWordType();
        System.out.println(maximumWordType.canBeTypedWords("abcd ii", "abcd"));
    }
}
