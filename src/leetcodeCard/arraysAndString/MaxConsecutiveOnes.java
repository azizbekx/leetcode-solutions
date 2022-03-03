package leetcodeCard.arraysAndString;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) {
                count=0;
            }else {
                count++;
            }
            if(max < count) max=count;
        }
        return max;
    }

    //Optimal solution of leetcode
    public int findMaxConsecutiveOnesO(int[] nums) {
        int finalMax = 0;
        int tempMax = 0;
        for (int i=0; i< nums.length; i++){
            if(nums[i] == 1){
                tempMax++;
            }
            else{
                if(tempMax > finalMax){
                    finalMax = tempMax;
                }
                tempMax = 0;
            }
        }
        if(tempMax > finalMax){
            return tempMax;
        }
        return finalMax;
    }

}
