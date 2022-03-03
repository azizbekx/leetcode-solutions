package leetcodeCard.arraysAndString;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    // time - O(n)
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascalT = new ArrayList<>();

        List<Integer> first = new ArrayList<>();
        first.add(1);
        pascalT.add(first);

        // i - number of rows
        // j - number of columns
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> prevRow = pascalT.get(i - 1);
            List<Integer> currRow = new ArrayList<>();

            currRow.add(1);
            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currRow.add(1);
            pascalT.add(currRow);
        }
        return pascalT.get(rowIndex);
    }

    // Optimal Solution of Leetcode
    public List<Integer> getRowO(int rowIndex) {

        int[][] arr = new int[rowIndex + 1][rowIndex + 1];
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        int temp = 0;
        while (temp <= rowIndex) {
            list.add(arr[rowIndex][temp]);
            temp++;
        }
        return list;
    }
}
