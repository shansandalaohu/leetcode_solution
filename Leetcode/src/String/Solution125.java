package String;

/**
 * @ClassName Solution125
 * @Description TODO
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * 示例 1:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * 输入: "race a car"
 * 输出: false
 * @Author LaoYang
 * Date 2018/12/29 20:54
 * @Version 1.0
 */
public class Solution125 {

    /**
     * 解法
     *
     * @return boolean
     * @Author LaoYang
     * @Description //TODO 定义两个指针分别指向数组开头和结尾，当该字符不是字母或者数字就移动指针，当该字符是字母或者数字时就比较两个字符的数值，如果相等就同时移动指针，否则就返回false
     * @Date 21:51 2018/12/29
     * @Param [s]
     **/

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        String s1 = s.toLowerCase();
        char[] chars = s1.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            //该字符不是字母或者数字就i++
            while (i < j && !isCase(chars[i])) {
                i++;
            }
            while (i < j && !isCase(chars[j])) {
                j--;
            }
            if (chars[i] == chars[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }

    //判断该字符是否是字母或者数字
    public boolean isCase(char ch) {
        if (ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        //System.out.println(isCase('a'));
        String str = "A man, a plan, a canal: Panama";
        Solution125 solution125 = new Solution125();
        System.out.println(solution125.isPalindrome(str));
    }
}
