package leetcodeCard.arraysAndString;

public class ReverseString {
    //time - O(n)
    //space - O(1);
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
}
