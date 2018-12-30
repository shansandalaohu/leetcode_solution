package String;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Solution387
 * @Description TODO
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 案例:
 * s = "leetcode"
 * 返回 0.
 * s = "loveleetcode",
 * 返回 2.
 * @Author LaoYang
 * Date 2018/12/29 23:05
 * @Version 1.0
 */
public class Solution387 {

    /**解法
     * @Author LaoYang
     * @Description //TODO 用HashMap存储对应字符的个数，当map中不含有该字符，则初始化，否则取出对应的值加1  -- 遍历之后再判断字符对应的数值，当值有等于1时返回，否则返回-1
     * @Date 23:55 2018/12/29
     * @Param [s]
     * @return int
     **/

    public static int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int i = 1;
        for (char ch : chars) {
            //表示map中不存在该字符
            if (!map.containsKey(ch)) {
                map.put(ch, i);
            } else {
                int len = map.get(ch);
                len = len + 1;
                map.put(ch, len);
            }
        }

        for (int j = 0; j < chars.length; j++) {
            if (map.get(chars[j]) == 1) {
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "loveleetcode";
        System.out.println(firstUniqChar(str));
    }
}
