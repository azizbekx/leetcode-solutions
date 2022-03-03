package leetcodeCard.arraysAndString;

public class RotateArray {
    /*
      time - O(n)
      space - O(1)
      Optimal Solution of leetcode
     */
    public void rotateO(int[] nums, int k) {

        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }

    public static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;
            l++;
            r--;
        }
    }

    /*
     time - O(m-n)
     space - O(1)
     Time limit exceeded
     */
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int last_element = 0;

        for (int i = 0; i < k; i++) {
            int last = nums[n - 1];
            for (int j = n - 2; j >= 0; j--) {
                nums[j + 1] = nums[j];
            }
            nums[0] = last;
        }
    }


}
