package 其他笔试试卷.有赞2019校招Java笔试B卷;

/**
 * @author yzh
 * @Description:
 * @Date: created in 20:07 2018/12/11
 * @Version: 1.0
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] array = {3,5,4,5,6,6,4,4,4,4,3,4};
        System.out.println(majorityElement(array));
    }

    public static int majorityElement(int[] array){
        int major = array[0], count = 1;
        for (int i = 1; i < array.length; i++) {
            if (count == 0) {
                count++;
                major = array[i];
            }else if (major == array[i]){
                count++;    //遇到的数是众数
            }else {
                count--;    //遇到的数不是众数
            }
        }
        return major;
    }
}
