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
