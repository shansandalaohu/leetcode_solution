package String;

/**
 * @ClassName Solution344
 * @Description TODO
 * 编写一个函数，其作用是将输入的字符串反转过来。
 * 示例 1:
 * 输入: "hello"
 * 输出: "olleh"
 * 示例 2:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: "amanaP :lanac a ,nalp a ,nam A"
 * @Author LaoYang
 * Date 2018/12/29 18:32
 * @Version 1.0
 */
public class Solution344 {

    public static String reverseString(String s) {

        StringBuffer result = new StringBuffer("");
        /*if (s == null || s.length() == 0) {
            return null;
        }*/

        char[] chars = s.toCharArray();
        int length = chars.length;
        for (int i = length - 1; i >= 0; i--) {
            result.append(chars[i]);
        }
        return result.toString();
    }

    public static String reverseString2(String s) {

        if (s == null || s.length() == 0) {
            return "";
        }
        char[] chars = s.toCharArray();

        int j = 0;
        int k = chars.length - 1;
        while (j < k) {
            char temp = chars[j];
            chars[j] = chars[k];
            chars[k] = temp;
            j++;
            k--;
        }
        return String.valueOf(chars);
    }


    public static void main(String[] args) {
        String re = "A man, a plan, a canal: Panama";
        System.out.println(reverseString(re));
        System.out.println(reverseString2(re));
    }
}
