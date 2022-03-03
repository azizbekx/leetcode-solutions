package leetcodeCard.arraysAndString;

public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {

        int a_pointer = 0;
        int b_pointer = numbers.length - 1;

        while (a_pointer <= b_pointer) {
            int sum = numbers[a_pointer] + numbers[b_pointer];

            if (sum > target) b_pointer--;
            else if (sum < target) a_pointer++;
            else return new int[]{a_pointer + 1, b_pointer + 1};
        }

        return new int[]{a_pointer + 1, b_pointer + 1};

    }

    //Optimal solution of leetcode
    public int[] twoSumO(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                return new int[]{start + 1, end + 1};
            }
            int mid = start + (end - start) / 2;
            if (sum < target) {
                start = numbers[mid] + numbers[end] <= target ? mid : start + 1;
            } else {
                end = numbers[start] + numbers[mid] >= target ? mid : end - 1;
            }
        }
        throw new IllegalArgumentException();
    }
}
