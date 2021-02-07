package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        // 1 创建 ArrayList 实例
        List<String> arrayList = new ArrayList<>();  // 向上转型
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());

        // 2 往其中添加元素
        //   add(一个参数)：添加到顺序表末尾
        arrayList.add("c");
        arrayList.add("c++");
        arrayList.add("java");
        arrayList.add("python");
        System.out.println(arrayList.size());
        System.out.println("尾插四次：" + arrayList);
        //   add(两个参数)：添加到顺序表末尾
        arrayList.add(2,"javascript");
        System.out.println(arrayList.size());
        System.out.println("中间插入一次：" + arrayList);

        // 3 删除
        //   按下标删除
        arrayList.remove(1);
        System.out.println("按位置删除" + arrayList);
    }
}
