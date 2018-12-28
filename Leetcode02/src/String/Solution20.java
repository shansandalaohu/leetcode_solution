package String;


import java.util.Stack;

/**
 * @ClassName Solution20
 * @Description TODO
 *  给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *  有效字符串需满足：
 *  左括号必须用相同类型的右括号闭合。
 *  左括号必须以正确的顺序闭合。
 *  注意空字符串可被认为是有效字符串。
 * @Author LaoYang
 * Date 2018/12/28 19:20
 * @Version 1.0
 */
public class Solution20 {

    /**解法
     * @Author LaoYang
     * @Description //TODO   用栈存储'('，'{'，'['字符串,当一遇到')'，'}'，']' 时就出栈一个字符串来比较，如果当前字符串和出栈的字符串不配对,说明字符串无效
     * @Date 19:35 2018/12/28
     * @Param [s]
     * @return boolean
     **/
    
    public boolean isValid(String s) {

        if (s == null || s.length() == 0) {
            return true;
        }

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char ch : chars) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char ch2 = stack.pop();
                if (ch == ')' && ch2 != '(') {
                    return false;
                }
                if (ch == '}' && ch2 != '{') {
                    return false;
                }
                if (ch == ']' && ch2 != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
