- leetcode链接

[链接]()
- 解题思路

方法一：哈希法
```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            int[] counts = new int[26];
            int length = str.length();
            for (int i = 0; i < length; i++) {
                counts[str.charAt(i) - 'a']++;
            }
            // 将每个出现次数大于 0 的字母和出现次数按顺序拼接成字符串，作为哈希表的键
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 26; i++) {
                if (counts[i] != 0) {
                    sb.append((char) ('a' + i));
                    sb.append(counts[i]);
                }
            }
            String key = sb.toString();
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            // 按Key值把数据存入map
            map.put(key, list);
        }
    // ArrayList<List<String>>
    return new ArrayList<List<String>>(map.values());
    }
}

```
时间复杂度：时间复杂度：O(n(k+∣Σ∣))，其中n是strs中的字符串的数量，k是strs 中的字符串的的最大长度，Σ 是字符集，在本题中字符集为所有小写字母，|\Sigma|=26∣Σ∣=26。
空间复杂度：时间复杂度：O(n(k+∣Σ∣))

方法二：排序法
```java
class SolutionSort {
  /**
   * 由于互为字母异位词的两个字符串包含的字母相同，因此对两个字符串分别进行排序之后得到的字符串一定是相同的，故可以将排序之后的字符串作为哈希表的键。
   * @param strs
   * @return
   */
  public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for (String str: strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key,list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
```

时间复杂度：时间复杂度：O(nklogk)，其中n是strs中的字符串的数量，k是strs中的字符串的的最大长度。需要遍历n个字符串，对于每个字符串，需要 O(klogk)的时间进行排序以及 O(1)的时间更新哈希表，因此总时间复杂度是 O(nklogk)

空间复杂度：空间复杂度：O(nk),需要用哈希表存储全部字符串。

