# leetcode链接
[283. 移动零 https://leetcode-cn.com/problems/move-zeroes/](https://leetcode-cn.com/problems/move-zeroes/)

# 解题思路
- 方法一
    * 类似于选择排序，暴力解法
    * 每次都选择前面的一个0和后面的一个非0进行交换
```java
class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        // 暴力循环法，类似于选择排序
        for (int i = 0; i < len; i++){
            for (int j = i; j < len ; j++){
                if(nums[i] == 0 &&  nums[j] != 0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
```    
    
    
- 方法二
    * 类似于快排
    * 把非0的逐个找出按顺序放在最前面
    * 后面的逐个置零
```java
class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        // 类似于快排，把非0逐个放左边
        int j = 0;
        for (int i = 0; i < len; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        // 后面的逐个置0
        for (;j < len; j++ ){
            nums[j] = 0;     
        }
    }
}
```    