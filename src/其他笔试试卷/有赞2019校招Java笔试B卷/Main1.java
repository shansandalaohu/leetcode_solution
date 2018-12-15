package 其他笔试试卷.有赞2019校招Java笔试B卷;

/**
 * @author yzh
 * @Description:
 * @Date: created in 10:48 2018/12/8
 * @Version: 1.0
 */
public class Main1 {

    public static void main(String[] args) {
        int[] array = {1};
        System.out.println(isInArray(array));
    }

    public static boolean isInArray(int[] array) {
        boolean flag = true;
        int length = array.length;
        int i = 0, count=0;
        while (i < length) {
            int i1 = array[i];
            count++;
            i += i1;
            if (i > length - 1 || i < 0) {
                return true;
            } else {
                flag = false;
            }
            if (count >= length) {
                return false;
            }
        }
        return flag;
    }
}






















