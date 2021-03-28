package SetAndMap;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // 1、使用 add 插入元素
        set.add("C");
        set.add("C++");
        //    如果插入重复的 key，实际之保存一份
        //    借助 Set 的这个特性可以进行”去重“
        set.add("C++");
        set.add("Java");
        set.add("Python");
        System.out.println(set);

        // 2、使用 contains 方法判定元素是否存在
        boolean ret = set.contains("java");
        System.out.println(ret);
    }
}
