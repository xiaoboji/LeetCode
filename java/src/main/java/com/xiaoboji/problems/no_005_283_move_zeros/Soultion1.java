package com.xiaoboji.problems.no_005_283_move_zeros;

public class Soultion1 {
    // 快慢指针，类似于快排胡思想
    public void moveZeroes(int[] nums) {
        if(nums.length == 0){
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                int temp = -1;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }
    }
}
