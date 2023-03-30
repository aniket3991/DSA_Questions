package easy;

public class LongestCommonPrefix {
    
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
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
        return prefix;
    }
    
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] arr = {"", "b"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(arr));
    }
}
