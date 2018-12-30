package String;

/**
 * @ClassName Solution38
 * @Description TODO
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * <p>
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * <p>
 * 注意：整数顺序将表示为一个字符串。
 * @Author LaoYang
 * Date 2018/12/28 22:29
 * @Version 1.0
 */
public class Solution38 {

    /**
     * 解法
     *
     * @return java.lang.String
     * @Author LaoYang
     * @Description //TODO 报数的第n项，所以肯定要循环n次即可。生成规则方面，就是先遍历当前的字符串，然后在相同的字符个数进行报数即可。
     * @Date 22:30 2018/12/28
     * @Param [n]
     **/
    public String countAndSay(int n) {
        String str = "1";
        int k;
        for (int i = 1; i < n; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int j = 0; j < str.length(); j = k) {
                k = j;
                //找出相同的
                while (k < str.length() && str.charAt(k) == str.charAt(j)) {
                    k++;
                }
                stringBuffer.append(k-j).append(str.charAt(j));
            }
            str = stringBuffer.toString();
        }
        return str;
    }
}
