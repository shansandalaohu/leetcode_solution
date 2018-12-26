package String;

/**验证回文字符串 Ⅱ
 * @author yzh
 * @Description: 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 *                  示例 1:
 *                  输入: "aba"
 *                  输出: True
 *                  示例 2:
 *                  输入: "abca"
 *                  输出: True
 *                  解释: 你可以删除c字符。
 * @Date: created in 9:50 2018/12/26
 * @Version: 1.0
 */
public class Solution680 {
    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        /*if(chars.length == 1 || chars.length == 2){
            return true;
        }*/
        int j = chars.length - 1, i = 0;
        //使用双指针，一个指向头，一个指向尾，如果两者不相同了，则可以将尾部的往前挪一个，或者首部的往后挪一个，判断这两种情况
        //这两种已经相当于删除了一个字符，如果还不是回文字符串，说明删除一个字符满足不了要求，就返回false
        while (i < j) {
            if (chars[i] != chars[j]) {
                return isValid(chars, i + 1, j) || isValid(chars, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isValid(char[] chars, int i, int j) {
        while (i < j) {
            if (chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
