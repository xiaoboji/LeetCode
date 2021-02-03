- leetcode链接

[有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/)
- 解题思路
方法一：排序法
```java
class SolutionSort {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // 排序方法
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();

        Arrays.sort(ss);
        Arrays.sort(ts);

        return Arrays.equals(ss,ts);
    }
}
```
因为用到了排序，java实现可以简单说是快排
- 时间复杂度O(nlogn)
- 空间复杂度O(logn)

方法二：哈希法
```java
class SolutionHash {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // hash法,一共26个字母
        int[] hash = new int[26];
        // 遍历s，统计个数
        for (int i = 0; i < s.length(); i++ ) {
            hash[s.charAt(i) - 'a']++;
        }
        // 遍历t,减少个数
        for (int j = 0; j < t.length(); j++) {
            hash[t.charAt(j) - 'a']--;
        }
        // 判断hash表，是不是有不正常的数字
        for (int k = 0; k < hash.length; k++) {
            if (hash[k] != 0) {
                return false;
            }
        }
        return true;
    }
}
```
因为用到了排序，java实现可以简单说是快排
- 时间复杂度O(n)
- 空间复杂度O(1) 26个

