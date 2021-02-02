- leetcode链接

[189. 旋转数组](https://leetcode-cn.com/problems/rotate-array/)

- 解题思路

方法一：额外数组法
```java
class Solution {
    public void rotate(int[] nums, int k) {
        // 当k值大于nums.length情况
        int realk = k % nums.length;
        // 特殊情况，不需要处理
        if(nums.length <= 1){
            return;
        }

        int len = nums.length;
        // 使用一个外部数组存储需要位移的后k位数
        int[] array = new int[realk];
        for (int i = len - realk; i < len; i++) {
            array[i - len + realk] = nums[i];
        }
        // 顺移前面的数组
        for (int i = len - realk - 1; i >= 0; i--) {
            nums[i + realk] = nums[i];
        }
        // 把外部数组的数据写回数组
        for (int i = 0; i < realk; i++) {
            nums[i] = array[i];
        }

    }

}

```



方法二：多次翻转法
```java
class Solution {
    public void rotate(int[] nums, int k) {
        int realk = k % nums.length;
        if (nums.length <= 1) {
            return;
        }

        int len = nums.length;
        // 第一次全量反转
        reserve(nums,0, len - 1);
        // 反转前k个数组
        reserve(nums,0, realk - 1);
        // 反转后面nums.length - k个数组
        reserve(nums, realk,len - 1);

    }
    // 反转数组
    public void reserve(int[] array, int i, int j) {
        while (j - i >= 1) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
```
