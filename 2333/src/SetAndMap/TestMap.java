package SetAndMap;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        // 1、使用 put 方法插入键值对
        // Map 内部的元素之间的先后顺序和插入的先后顺序关系不大
        map.put("及时雨","宋江");
        map.put("黑旋风","李逵");
        map.put("行者","武松");
        map.put("小李广","花荣正牌");
        // 当 put 时，如果 key 已经存在，此时就会覆盖原有的value
        map.put("及时雨","宋公雨");
        System.out.println(map);

        // 2、使用 get 方法，根据 key 获取 value
//        String value = map.get("行者");
        //    如果 get 时 key 不存在，get 返回 null
//        String value1 = map.get("小李广");
        //    还可以使用 getOrderDefault 来根据 key 获取 value
        //    如果 key 不存在，getOrDefault 返回一个默认值
        String value2 = map.getOrDefault("小李广","花荣");
        System.out.println(value2);

        // 3、使用 isEmpty 判定空
        System.out.println(map.isEmpty());

        // 4、使用 size 方法获取到键值对的个数
        System.out.println(map.size());

        // 5、使用 clear 清空所有的键值对
//        map.clear();
//        System.out.println(map.isEmpty());
//        System.out.println(map.size());

        // 6、遍历 Map (Map 设计出来不是为了遍历的)
        //    比较复杂，需要把 Map 转换成 Set 再遍历
        //    Entry 是 Map 的内部类，条目，每个条目就是一个键值对
        // map.entrySet() 把 Map 这样的键值对结构进行了转换，转换成一个 Set
        // Set 里面的每个元素都是一个 Entry
        // 每个 Entry 里面包含了 key 和 value
//        for(Map.Entry<String,String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }

        // 7、还可以单独的获取到所有的 key 和所有的 value
        //  所有的 key 拿出来放到一个新的 Set 中
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        //  所有的 value 拿出来放到一个 Collection 中，允许重复
        for (String value : map.values()) {
            System.out.println(value);
        }
        // entrySet, keySet,values 都是非常低效的方法
    }
}
