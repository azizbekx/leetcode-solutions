package leetcodecard.arraysandstring;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalT =new ArrayList<>();

        if(numRows == 0) {return pascalT;}

        List<Integer> firstRow = new ArrayList();
        firstRow.add(1);
        pascalT.add(firstRow);

        // i are rows
        // j are columns
        for(int i=1; i<numRows; i++){
            List<Integer> prevRow= pascalT.get(i-1);
            List<Integer> currRow = new ArrayList<>();

            currRow.add(1);
            for(int j=1; j<i; j++){
                currRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            currRow.add(1);
            pascalT.add(currRow);
        }
        return pascalT;
    }
}
