# leetcode
[1. 两数之和 https://leetcode-cn.com/problems/two-sum/](https://leetcode-cn.com/problems/two-sum/)

方法一：暴力循环法
```java
class SolutionForFor {
  public int[] twoSum(int[] nums, int target) {
    for(int i = 0; i < nums.length; i++){
      for (int j = i + 1; j < nums.length; j++){
        if(nums[i] + nums[j] == target){
            return new int[]{i, j};
        }
      }
    }
    return null;
  }
}

```
时间复杂度O(N2),空间复杂度O(1)

方法二：hash法
```java
class SolutionHashMap {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
```
时间复杂度O(N),空间复杂度O(N)