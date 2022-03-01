package leetcodeCard.arraysAndString;

public class ImplementStr {

    //O(n) - time
    //O(1) - space

    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || haystack.length() < needle.length()) return -1;

        int nl = needle.length();
        if (nl == 0) return 0;

        for (int i = 0; i < haystack.length() - nl + 1; i++) {
            if (haystack.charAt(i) != needle.charAt(0))
                continue;
            if (haystack.substring(i, i + nl).equals(needle))
                return i;
        }
        return -1;
    }
}
