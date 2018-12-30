package String;

/**
 * @ClassName Solution434
 * @Description TODO 字符串中的单词数
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 * 示例:
 * 输入: "Hello, my name is John"
 * 输出: 5
 * @Author YZH
 * @Date 2018/12/30 20:20
 * @Version 1.0
 **/
public class Solution434 {

    /**
     * 解法
     *
     * @return int
     * @Author YZH
     * @Description //TODO 原始思路就是，统计一遍只要前面的字母不是空格，那么遇到一个空格我就认为是一个单词，统计次数加1.
     * preSpace：表示前一个字母是不是空格，是为true，不是为false
     * havaLetters：表示这个字符串中到底有没有出现过非空格的元素，也就说有没有出现单词。有为true，没有为false；当时设置这个变量是为了避免字符串不是以空格结尾的情况，
     * 那样就会少统计一个单词了，所以最后判断如果单词不是以空格结尾的并且出现过单词就要把统计次数加1,。
     * @Date 20:21 2018/12/30
     * @Param [s]
     **/
    public static int countSegments(String s) {
        if (s.equals("") || s == null)
            return 0;
        char[] chars = s.toCharArray();
        boolean preSpace = (chars[0] == ' ') ? true : false;
        //System.out.println(preSpace);
        boolean haveLetters = false;
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                if (!preSpace) {
                    count++;
                    preSpace = true;
                }
            } else {
                haveLetters = true;
                preSpace = false;
            }
        }
        //System.out.println(haveLetters);
        if (haveLetters && chars[s.length() - 1] != ' ')
            count++;
        return count;
    }


    public static void main(String[] args) {
        String str = "Hello, my name is John";
        System.out.println(countSegments(str));
    }
}




