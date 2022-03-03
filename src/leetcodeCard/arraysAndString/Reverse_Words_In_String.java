package leetcodeCard.arraysAndString;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_Words_In_String {

    // 3 line solution with trim and split method
    public String reverseWords(String s) {

        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);

    }

    // Optimal Solution of Leetcode
    public String reverseWordsO(String s) {
        if (s.length() == 0) return "";
        StringBuilder sb = new StringBuilder();
        int index = s.length() - 1;
        while (index >= 0) {
            int r = findEnd(s, index);
            int l = findStart(s, r);
            //System.out.println("l: "+l+", r: "+r);
            if (r == l && r == -1) return sb.toString();
            r++;
            if (l == -1) {
                l = 0;
            }
            if (sb.length() > 0 && r > 0) sb.append(' ');
            sb.append(s.substring(l, r));
            index = l - 1;
        }
        return sb.toString();
    }


    //-1 means we are done
    private int findEnd(String s, int start) {
        while (start >= 0 && s.charAt(start) == ' ') start--;
        return start;
    }

    private int findStart(String s, int start) {
        while (start >= 0 && s.charAt(start) != ' ') start--;
        return start + 1;
    }

    // Another possible solution
    // time - O(n)
    // space - O(1)
    public String reverseWordsOO(String s) {
        StringBuilder reversed=new StringBuilder();
        int j=s.length();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ') { j=i;}
            else if(i==0||s.charAt(i-1)==' ')
            {
                if(reversed.length()!=0){reversed.append(' ');}
                reversed.append(s.substring(i,j));
            }
        }
        return reversed.toString();
    }

}
