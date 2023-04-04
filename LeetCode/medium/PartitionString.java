package medium;

import java.util.HashSet;
import java.util.Set;

public class PartitionString {
    public int partitionString(String s) {
        int count = 0;
        Set<Character> subString = new HashSet<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(subString.contains(s.charAt(i))){
                count++;
                subString.clear();
            }
            subString.add(s.charAt(i));
        }
        if(!subString.isEmpty())
            count++;
        return count;
    }
    public static void main(String[] args) {
        PartitionString partitionString = new PartitionString();
        System.out.println(partitionString.partitionString("abacaba"));
    }
}
