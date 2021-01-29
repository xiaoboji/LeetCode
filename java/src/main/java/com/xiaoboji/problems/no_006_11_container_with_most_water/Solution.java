package com.xiaoboji.problems.no_006_11_container_with_most_water;

class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        // 暴力解法，算出每个间隔的面积，取最大值
        for(int i = 0; i < height.length; i++){
            for(int j = i+1; j < height.length; j++ ){
                //
                int temp = (j - i) * Math.min(height[i],height[j]);
                if(temp > result){
                    result = temp;
                }
            }
        }
        return result;
    }
}
