# leetcode链接

- [删除排序数组中的重复项](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/submissions/)

- 解题思路
    * 双指针法，后指针在不相等的时候才+1
```java
class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        // 双指针法，i和j j在不相等的时候才+1
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i]; 
                }
            } 
        // j 初始值为0，需要+1
        return j + 1;    
    }  
}
```
