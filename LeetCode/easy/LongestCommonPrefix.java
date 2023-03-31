package easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    
    public String longestCommonPrefix(String[] strs) {
    /*    String prefix = "";
        int min = strs[0].length();
        for(int i = 1; i < strs.length; i++) {
            if(min > strs[i].length())
                min = strs[i].length();
        }
        
        if(min == 0) return "";
        if(strs.length == 1) return strs[0];
        
        int idx = 0;
        
        while(idx < min){
            
            for(int j = 0; j < strs.length - 1; j++){
                if(strs[j].charAt(idx) == strs[j+1].charAt(idx)){
                    if(j == strs.length - 2)
                        prefix += strs[j].charAt(idx);
                }else{
                    idx = min;
                    break;
                }    
            }
            idx++;
        }
        return prefix;*/
        /*String result = "";
        Arrays.sort(strs);
        
        int min = Math.min(strs[0].length(), strs[strs.length -1].length());
        for(int i = 0; i < min; i++) {
            if(strs[0].charAt(i) == strs[strs.length - 1].charAt(i))
                result += strs[0].charAt(i);
            else
                break;
        }
        return result;*/
        String result = strs[0];
        
        for (String str : strs) {
            while (str.indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] arr = {"", "b"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(arr));
    }
}
