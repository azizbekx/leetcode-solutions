package leetcodeCard.arraysAndString;

import java.util.Arrays;

public class ArrayPartition {
    // time - O(nlogn)
    // space - O(1)

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public int arrayPairSumO(int[] nums) {
        // Optimal solution
        int[] exist = new int[20001];
        /*
        1) sort array
         nums = [1,4,3,2]

                      10001  10002  10003  10004
        exist[0,,,,,,,1     ,1     ,1     ,1      ,0,,,,,0];
        2) sum odd position number
        min({1},2) + min({3},4) = 4;

                      10001  10002  10003  10004
        exist[0,,,,,,,{1}     ,1     ,{1}     ,1      ,0,,,,,0];
        */
        for(int i=0; i<nums.length; i++){
            exist[nums[i] + 10000]++;
        }
        int sum=0;
        boolean odd = true;

        for(int i=0; i<exist.length; i++) {
            while (exist[i] > 0) {
                if (odd) {
                    sum += i - 10000;
                }
                odd = !odd;
                exist[i]--;
            }
        }
        return sum;
    }
}
