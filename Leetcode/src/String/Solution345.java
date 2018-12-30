package String;

/**
 * @ClassName Solution345
 * @Description TODO 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * <p>
 * 示例 1:
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 * 输入: "leetcode"
 * 输出: "leotcede"
 * @Author LaoYang
 * Date 2018/12/29 21:56
 * @Version 1.0
 */
public class Solution345 {

    /**解法
     * @Author LaoYang
     * @Description //TODO  先定义一个函数用于判断是否是元音字母，然后定义两个指针分别指向数组头部和尾部，
     * 如果判断字符不是元音字母，指针就移动，当两个指针指向的字符都是元音字母并且这两个字母没有相同时，就交换这两个字母
     * @Date 22:14 2018/12/29
     * @Param [s]
     * @return java.lang.String
     **/

    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {

            while (i < j && !isYuanYin(chars[i])) {
                i++;
            }

            while (i < j && !isYuanYin(chars[j])) {
                j--;
            }

            if (i < j && isYuanYin(chars[i]) && isYuanYin(chars[j]) && chars[i] != chars[j]) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
            i++;
            j--;
        }
        return String.valueOf(chars);

    }

    //判断是否是元音字母
    public boolean isYuanYin(char ch) {
        char chs = Character.toLowerCase(ch);
        if (chs == 'a' || chs == 'e' || chs == 'i' || chs == 'o' || chs == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String str = "race a car";
        Solution345 solution345 = new Solution345();
        System.out.println(solution345.reverseVowels(str));
    }
}
