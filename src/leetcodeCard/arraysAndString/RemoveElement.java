package leetcodeCard.arraysAndString;

public class RemoveElement {
    /*
    time - O(n)
    space - O(1)

    Two pointer technique
    */
    public int removeElement(int[] nums, int val) {

        int write = 0;
        for (int read=0; read< nums.length; read++){
            if(nums[read] != val) {
                nums[write] = nums[read];
                write++;
            }
        }
        return write;
    }
}
