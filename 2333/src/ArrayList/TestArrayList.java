package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
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
        //   按内容删除
        arrayList.remove("c++");
        System.out.println("按值删除：" + arrayList);

        // 4 查找
        boolean ret = arrayList.contains("java");
        System.out.println("查找java 的结果为：" + ret);

        int index = arrayList.indexOf("java");
        System.out.println("查找java 的位置为：" + index);

        // 5 获取 / 修改元素
        String elem = arrayList.get(0);
        System.out.println("0 号元素为：" + elem);
        arrayList.set(0, "PHP");
        System.out.println("修改后的顺序表：" + arrayList);

        // 6 遍历
        //   （1）通过下标来进行遍历
        System.out.println("通过下标来遍历：");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        //   （2）通过迭代器来进行遍历
        System.out.println("通过迭代器来遍历：" );
        //        先通过 iterator 方法获取到迭代器对象
        Iterator<String> iterator = arrayList.iterator();
        //        再通过 while 循环来进行遍历
        while (iterator.hasNext()) {
            String e = iterator.next();
            System.out.println(e);
        }
        //   （3）for-each 来进行遍历(本质上是基于迭代器)
        System.out.println("通过 for-each 进行遍历：");
        for (String e : arrayList) {
            System.out.println(e);
        }
    }
}
