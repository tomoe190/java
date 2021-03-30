package SetAndMap;

import java.util.HashMap;
import java.util.Map;

public class OJ {
    public int singleNumber (int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int x : nums) {
            Integer value = map.get(x);
            if (value == null) {
                map.put(x,1);
            } else {
                map.put(x,value + 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,2,4};
        OJ oj = new OJ();
        int ret = oj.singleNumber(nums);
        System.out.println(ret);
    }
}
