> 核心说明假设你总是可以到达数组的最后一个位置。
 
- 方法一：从后往前贪心找出发位置
```
class Solution {
    public int jump(int[] nums) {
        int position = nums.length - 1;
        int steps = 0;
        while (position > 0) {
            // 「贪心」地选择距离最后一个位置最远的那个位置，也就是对应下标最小的那个位置。
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    steps++;
                    break;
                }
            }
        }
        return steps;
    }
}

```

时间复杂度：O(n^2)
空间复杂度：O(1)

- 方法二：正向查找可到达的最大位置
```
class Solution {
    // 贪心算法，每次在可跳范围内选择可以使得跳的更远的位置
    public int jump(int[] nums) {   
        int end = 0; // 上次跳跃可达范围右边界（下次的最右起跳点）
        int maxPosition = 0;
        int steps = 0;
        for(int i = 0; i < nums.length - 1; i++){
            //找能跳的最远的
            maxPosition = Math.max(maxPosition, nums[i] + i);
            //到达上次跳跃能到达的右边界了
            if( i == end){
                end = maxPosition;// 目前能跳到的最远位置变成了下次起跳位置的有边界
                steps++;// 进入下一次跳跃
            }
        }
        return steps;
    }
}
```
时间复杂度：O(n)
空间复杂度：O(1)