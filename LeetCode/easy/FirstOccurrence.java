package easy;

public class FirstOccurrence {

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        FirstOccurrence firstOccurrence = new FirstOccurrence();
        System.out.println(firstOccurrence.strStr("Hello how are you", "how"));
    }
}
