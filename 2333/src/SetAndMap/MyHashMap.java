package SetAndMap;

class HashNode {
    public int key;
    public int value;
    HashNode next;

    public HashNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class MyHashMap {
    // 哈希表的核心是一个数组，数组上的每个元素是一个链表
    private HashNode[] array = new HashNode[16];
    private int size = 0;

    // 通过这个方法把 key 映射成数组下标
    // 简单求余
    // 也可以根据实际情选取更复杂的方法，比如根据 key 计算 md5 再求余
    private int hashCode(int key) {
        return key % array.length;
    }

    // 核心方法
    public void put (int key,int value) {
        // 1、现根据 key ，计算出下标位置
        int index = hashCode(key);
        // 2、看 key 在 hash 表中是否存在
        //    如果存在-->修改value
        //    如果不存在-->直接插入新节点
        for (HashNode cur = array[index];cur != null;cur = cur.next) {
            if (cur.key == key) {
                cur.value = value;
                return ;
            }
        }
        // 3、如果经过循环没有找到匹配的 key 说明不存在
        //    就需要创建新的节点插入到链表上 (头插)
        HashNode newNode = new HashNode(key,value);
        newNode.next = array[index];
        array[index] = newNode;
        size++;

        // 4、如果持续插入就可能导致冲突概率越来越大
        //    链表越来越长，会影响到后续操作效率，需要扩容
        //    “负载因子”  元素个数 / 数组长度
        if (loadFactor() > 0.75) {
            resize();
        }
    }

    private void resize() {
        HashNode[] newArray = new HashNode[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            HashNode next = null;
            for (HashNode cur = array[i];cur != null;cur = next) {
                next = cur.next;
                int newIndex = cur.key % newArray.length;
                cur.next = newArray[newIndex];
                newArray[newIndex] = cur;
            }
        }
        array = newArray;
    }

    private double loadFactor() {
        return (double)size / array.length;
    }

    public Integer get(int key) {
        int index = hashCode(key);
        for(HashNode cur = array[index];cur != null;cur = cur.next) {
            if (cur.key == key) {
                return cur.value;
            }
        }
        return null;
    }

    public void remove(int key) {
        int index = hashCode(key);
        HashNode prev = null;
        for (HashNode cur = array[index];cur != null;cur = cur.next) {
            if (cur.key == key ){

            }
        }
    }
}
