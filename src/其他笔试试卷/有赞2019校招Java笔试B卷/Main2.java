package 其他笔试试卷.有赞2019校招Java笔试B卷;

/**
 * @author yzh
 * @Description:
 * 字符串旋转:
 * 给定两字符串A和B，如果能将A从中间某个位置分割为左右两部分字符串（都不为空串），并将左边的字符串移动到右边字符串后面组成新的字符串可以变为字符
 * 串B时返回true。
 * 例如：如果A=‘youzan’，B=‘zanyou’，A按‘you’‘zan’切割换位后得到‘zanyou’和B相同返回true。
 * @Date: created in 15:58 2018/12/22
 * @Version: 1.0
 */
public class Main2 {

    public static void main(String[] args) {
        Main2 main2 = new Main2();
        System.out.println(main2.reverseString("youzan","zanyou"));
    }

    /**
     * 解法: 用一个for循环,将第一个字符串迭代地分割,拼接到剩余的那部分尾部,如果拼接出来的字符串和第二个字符串相同,返回true,否则返回false
     * @param str1
     * @param str2
     * @return
     */
    public boolean reverseString(String str1,String str2){


        boolean flag = false;

        for (int i = 0; i < str1.length();i++){
            StringBuffer sb = new StringBuffer(str1.substring(i, str1.length()));
            sb.append(str1.substring(0,i));
            if (sb.toString().equals(str2)){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
