package String;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yzh
 * @Description:
 * @Date: created in 9:24 2018/12/26
 * @Version: 1.0
 */
public class Solution13 {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("I",1);
        hashMap.put("V",5);
        hashMap.put("X",10);
        hashMap.put("L",50);
        hashMap.put("C",100);
        hashMap.put("D",500);
        hashMap.put("M",1000);

        return 0;
    }
}
