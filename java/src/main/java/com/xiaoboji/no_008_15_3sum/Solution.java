package com.xiaoboji.no_008_15_3sum;

import java.util.*;

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet set = new HashSet();
        //暴力法，循环找到结果再去重，但是超时了
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> per = new ArrayList<>();
                        per.add(nums[i]);
                        per.add(nums[j]);
                        per.add(nums[k]);
                        Collections.sort(per);
                        set.add(per);
                    }
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            result.add((List<Integer>)iterator.next());
        }
        return result;
    }

}
