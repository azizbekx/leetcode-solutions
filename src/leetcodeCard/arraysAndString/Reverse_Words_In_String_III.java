package leetcodeCard.arraysAndString;

public class Reverse_Words_In_String_III {
    // Simple solution

    public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            res.append(new StringBuffer(word).reverse().toString() + " ");

        }
        return res.toString().trim();
    }

    //Optimal Solution of Leetcode with recursion method
    public String reverseWordsO(String s) {
        char[] seq = s.toCharArray();
        reverse(seq, 0);
        return new String(seq);
    }

    public void reverse(char[] seq, int index) {
        int firstIndex = index;
        while (index < seq.length && seq[index] != ' ') {
            index++;
        }
        int lastIndex = index - 1;
        while (firstIndex < lastIndex) {
            char temp = seq[firstIndex];
            seq[firstIndex] = seq[lastIndex];
            seq[lastIndex] = temp;
            firstIndex++;
            lastIndex--;
        }
        if (index < seq.length) {
            reverse(seq, index + 1);
        } else {
            return;
        }
    }
}
