package leetcodeCard.arraysAndString;

public class IsSubsequence {
    // time - O(n) n = length of t
    // space - O(1)
    public boolean isSubsequence(String s, String t) {

        int j = 0;
        for (int i = 0; i < t.length() && j < s.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) j++;
        }

        return j == s.length();
    }

    //Optimal solution of leetcode
    public boolean isSubsequenceO(String s, String t) {
        for (char ch : s.toCharArray()) {
            int find = t.indexOf(ch);
            if (find == -1) {
                return false;
            } else {
                t = t.substring(find + 1);
            }
        }

        return true;
    }
}

