//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。 
//
// 
//
// 进阶： 
//
// 
// 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。 
// 你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？ 
// 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,2,3,4,5,6,7], k = 3
//输出: [5,6,7,1,2,3,4]
//解释:
//向右旋转 1 步: [7,1,2,3,4,5,6]
//向右旋转 2 步: [6,7,1,2,3,4,5]
//向右旋转 3 步: [5,6,7,1,2,3,4]
// 
//
// 示例 2: 
//
// 
//输入：nums = [-1,-100,3,99], k = 2
//输出：[3,99,-1,-100]
//解释: 
//向右旋转 1 步: [99,-1,-100,3]
//向右旋转 2 步: [3,99,-1,-100] 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 2 * 104 
// -231 <= nums[i] <= 231 - 1 
// 0 <= k <= 105 
// 
//
// 
// 
// Related Topics 数组 
// 👍 867 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
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
//leetcode submit region end(Prohibit modification and deletion)
