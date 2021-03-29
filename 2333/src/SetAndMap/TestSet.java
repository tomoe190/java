package SetAndMap;

import java.util.HashSet;
import java.util.Iterator;
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

        // 3、使用 remove 删除元素
//        set.remove("Java");
//        System.out.println(set);
//
//        // 注意 ！！！set 中的元素不能修改
//        // 要修改需要删除之后重新插入
//
//        // 4、使用isEmpty 来判定空
//        System.out.println(set.isEmpty());
//        // 5、使用 size 获取元素个数
//        System.out.println(set.size());
//        // 6、使用 clear 清空元素
//        set.clear();
//        System.out.println(set.isEmpty());
//        System.out.println(set.size());

        //7、遍历
        // 第一种，直接使用for-each [语法糖]
        // 什么样的类可以使用 for—each？
        //    如果这个类能支持迭代器就可以，实现了 Iterable 接口
        for(String key : set) {
            System.out.println(key);
        }
        // 第二种，使用迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
