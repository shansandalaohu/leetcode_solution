package String;

import java.util.Stack;

/**
 * @ClassName Solution58
 * @Description TODO
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * @Author LaoYang
 * Date 2018/12/28 22:49
 * @Version 1.0
 */
public class Solution58 {

    /**解法
     * @Author LaoYang
     * @Description //TODO
     * 先用trim()方法去除字符串后面多余的空格，然后将字符串转成字符数组，从后往前遍历，没有遇到空格时，将字符如栈，否则终止遍历，然后将字符逐个取出，就是要求的字符串
     * @Date 23:14 2018/12/28
     * @Param [s]
     * @return int
     **/
    public static int lengthOfLastWord(String s) {
        String str = s.trim();
        char[] chars = str.toCharArray();
        int length = chars.length;
        StringBuffer stringBuffer = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        int blanknum = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                stack.push(chars[i]);
            } else {
                break;
            }
        }
        while (!stack.isEmpty()) {
            stringBuffer.append(stack.pop());
        }
        return stringBuffer.toString().length();
    }

    public static void main(String[] args) {
        String str = "dadsdd a ";
        int hello_world = lengthOfLastWord(str);
        System.out.println(str.trim());
        System.out.println(hello_world);
    }
}
