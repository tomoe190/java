package SetAndMap;

import java.util.*;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
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

    public static Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<>();
        for (Node cur = head;cur != null;cur = cur.next) {
            map.put(cur,new Node(cur.val));
        }
        for (Node cur = head;cur != null;cur = cur.next) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
        }
        return map.get(head);
    }

    public static int numJewelsInStones (String jewels,String stones) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) {
                count ++;
            }
        }
        return count;
    }

    public List<String> topKFrequent (String[] words,int k) {
        // 1、使用 Map 统计 words 中每个单词出现的次数
        Map<String,Integer> map = new HashMap<>();
        for(String x : words) {
//            Integer value = map.getOrDefault(x,0);
//            map.put(x,value + 1);
            Integer value = map.get(x);
            if (value == null) {
                map.put(x, 1);
            } else {
                map.put(x, value + 1);
            }
        }
        // 2、把所有的 key 都取出来，放到一个 List 中
        List<String> wordList = new ArrayList<>(map.keySet());
        /**
         * 3、把 wordList 进行排序，在 sort 的第二个参数中，
         *   传入一个 Comparator 比较器对象，用来指定比较的规则。
         *   这里创建了一个匿名内部类，并且创建了该类的实例，
         *   这个内部类的类名不清楚，但知道这个类实现了 Comparator 接口，
         *   { }中的内容就是匿名内部类的实现
         */
        // lambda 表达式相当于一个匿名的方法
//        Collections.sort(wordList, (o1, o2) -> 0);
        Collections.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer count1 = map.get(o1);
                Integer count2 = map.get(o2);
                if (count1.equals(count2)) {
                    return o1.compareTo(o2);
                }
                return count2 - count1;
            }
        });
        return wordList.subList(0,k);
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,1,2,4};
//        OJ oj = new OJ();
//        int ret = oj.singleNumber(nums);
//        System.out.println(ret);

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String excepted = scanner.next();
            String actual = scanner.next();

            excepted = excepted.toUpperCase();
            actual = actual.toUpperCase();
        }

    }
}
