package String;

/**
 * @ClassName Solution67
 * @Description TODO
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 输入为非空字符串且只包含数字 1 和 0。
 * <p>
 * 示例 1:
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 * @Author LaoYang
 * Date 2018/12/29 16:07
 * @Version 1.0
 */
public class Solution67 {
    public String addBinary(String a, String b) {
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        String result = "";
        int sum = 0;
        while (aLen >= 0 || bLen >= 0) {
            if (aLen >= 0) {
                sum += Integer.parseInt(a.substring(aLen, aLen + 1));
                aLen--;
            }

            if (bLen >= 0) {
                sum += Integer.parseInt(b.substring(bLen, bLen + 1));
                bLen--;
            }

            //表示的是1+1，要进位,此时此位为0，并且前一位要加一
            if (sum == 2) {
                result = "0" + result;
                sum = 1;//表示进位
            } else if (sum == 0 || sum == 1) {
                result = sum + "" + result; //没有进位，sum的值是多少，就写多少  ==》 表示0+0或者0+1的情况
                sum = 0;//表示没进位
            } else if (sum == 3) {
                result = "1" + result;      //表示得到上一次计算的进位，以及1+1这样的情况
                sum = 1;                    //表示向前进位
            }

        }
        if (sum == 1) {
            result = "1" + result;  //表示最后一次运算要进位，所以要多加一个"1" ==》指向while循环中的sum==2或者sum==3这两种情况
        }

        return result;
    }
}
