package com.xiaoboji.problems.no_019_valid_anagram;//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 
//
// 示例 1: 
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 输入: s = "rat", t = "car"
//输出: false 
//
// 说明: 
//你可以假设字符串只包含小写字母。 
//
// 进阶: 
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
// Related Topics 排序 哈希表 
// 👍 335 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
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
//leetcode submit region end(Prohibit modification and deletion)
