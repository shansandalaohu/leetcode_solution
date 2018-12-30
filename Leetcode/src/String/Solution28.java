package String;

/**
 * @ClassName Solution28
 * @Description TODO
 * 实现 strStr() 函数。
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * 示例 1:
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 * @Author LaoYang
 * Date 2018/12/28 19:20
 * @Version 1.0
 */
public class Solution28 {

    /**
     * 解法
     *
     * @return int
     * @Author LaoYang
     * @Description //TODO
     * @Date 19:39 2018/12/28
     * @Param [haystack, needle]
     **/

    public static int strStr(String haystack, String needle) {

        if (needle.length() == 0 || needle == null) {
            return 0;
        }

        if (haystack.length() == 0 || haystack == null) {
            return -1;
        }

        char[] chars = needle.toCharArray();
        int length = chars.length;  //needle字符串的长度
        int length1 = haystack.length();
        int index = 0;
        while (index < length1 && index + length < length1 + 1) {
            if (chars[0] == haystack.charAt(index) && needle.equals(haystack.substring(index, index + length))) {
                return index;
            } else {
                index++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int count = strStr("a", "a");
        System.out.println(count);
    }

}
