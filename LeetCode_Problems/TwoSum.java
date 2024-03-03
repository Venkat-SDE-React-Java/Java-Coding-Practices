package LeetCode_Problems;

import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] sum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    sum[0] = i;
                    sum[1] = j;
                    break;
                }
            }

        }
        return sum;
    }
    public static void main(String[] args){
        TwoSum sums= new TwoSum();
        int[] numsArray = new int[]{3,2,3};
        int target = 6;
        int[] sum = sums.twoSum(numsArray,target);
        for (int i=0;i<2;i++) {
            System.out.println(sum[i]);
        }
    }
}


//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].