package String;

/**
 * @ClassName Solution443
 * @Description TODO 压缩字符串
 * 给定一组字符，使用原地算法将其压缩。
 * 压缩后的长度必须始终小于或等于原数组长度。
 * 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
 * 在完成原地修改输入数组后，返回数组的新长度。
 * 进阶：
 * 你能否仅使用O(1) 空间解决问题？
 * <p>
 * 示例 1：
 * 输入：
 * ["a","a","b","b","c","c","c"]
 * 输出：
 * 返回6，输入数组的前6个字符应该是：["a","2","b","2","c","3"]
 * 说明：
 * "aa"被"a2"替代。"bb"被"b2"替代。"ccc"被"c3"替代。
 * <p>
 * 示例 2：
 * 输入：
 * ["a"]
 * 输出：
 * 返回1，输入数组的前1个字符应该是：["a"]
 * 说明：
 * 没有任何字符串被替代。
 * <p>
 * 示例 3：
 * 输入：
 * ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * 输出：
 * 返回4，输入数组的前4个字符应该是：["a","b","1","2"]。
 * 说明：
 * 由于字符"a"不重复，所以不会被压缩。"bbbbbbbbbbbb"被“b12”替代。
 * 注意每个数字在数组中都有它自己的位置。
 * @Author YZH
 * @Date 2018/12/30 19:52
 * @Version 1.0
 **/
public class Solution443 {

    /**
     * 解法
     *
     * @return
     * @Author YZH
     * @Description //TODO 统计次数然后变成char数组之后放在统计的那个字符的第一个字符后面覆盖掉后面的元素。
     * 注意如果只有一个字符，也就是time == 1的情况下是不需要压缩的，直接就把这个字符拿过来就好了。
     * @Date 19:55 2018/12/30
     * @Param
     **/
    public int compress(char[] chars) {
        int index = 0;
        if (chars.length < 2)
            return chars.length;
        for (int i = 0; i < chars.length; ) {
            int times = 1;
            chars[index++] = chars[i++];
            while (i < chars.length && chars[i] == chars[i - 1]) {
                times++;
                i++;
            }
            if (times > 1) {
                char[] chs = String.valueOf(times).toCharArray();
                for (int j = 0; j < chs.length; j++)
                    chars[index++] = chs[j];
            }
        }
        return index;
    }

}






