package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

class people implements Comparable<people>{
    public String name;
    public int age ;
    public int money;
    public int face;

    public people(String name, int age, int money, int face) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.face = face;
    }

    // 谁需要对比，就让谁实现 comparable 接口
    @Override
    public int compareTo(people o) {
        return o.face - this.face;
    }
}

// 创建一个新的类，通过这个新的类去比较旧的类
class peopleComparator implements Comparator<people> {
    @Override
    public int compare(people o1, people o2) {
        return o1.money - o2.money;
    }
}

public class Test {
    public static void main(String[] args) {
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        int[] arr = {5,7,2,8,1,9,10};
//        for(int x : arr) {
//            queue.offer(x);
//        }
//        while (!queue.isEmpty()) {
//            int x = queue.poll();
//            System.out.println(x);
//        }

        people[] arr = {
                new people("张三",18,10,100),
                new people("李四",28,20,80),
                new people("王五",38,30,60),
                new people("赵六",48,40,40),
                new people("杨九",58,50,20)
        };
        PriorityQueue<people> queue = new PriorityQueue<>();
        for (people a : arr) {
            queue.offer(a);
        }
        while (!queue.isEmpty()) {
            people x = queue.poll();
            System.out.println(x.name);
        }

    }
}
