package ArrayList;

import java.util.Arrays;

public class MyArrayList {
    private String[] data = null;
    // 当前顺序表中有效的元素个数
    private int size = 0;
    // 当前顺序表中的最大容纳元素个数，如果 size 超过了capacity 就需要扩容
    private int capacity = 100;

    public MyArrayList() {
        data = new String[capacity];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(data[i]);
            if (i < (size - 1)) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    // 扩容
    private void realloc() {
        capacity = 2 * capacity;
        String[] newData = new String[capacity];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    // 1.把元素插到顺序表末尾
    public void add(String elem) {
        if (size >= capacity) {
            realloc();
        }
        data[size] = elem;
        size ++;
    }
    // 时间复杂度：O（N）

    // 2.把元素插入到任意中间位置
    public void add (int index,String elem) {
        if (index < 0 || index > size) {
            return;
        }
        if (size >= capacity) {
            realloc();
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = elem;
        size ++;
    }

    // 3.按照下标位置删除元素
    public String remove (int index) {
        if (index < 0 || index > size) {
            return null;
        }
        String result = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
            
        }
        return result;
    }

    // 4.按照元素的值删除
    public boolean remove (String elem) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(elem)) {
                for (int j = i;j < size - 1;j++) {
                    data[j] = data[j + 1];
                    size --;
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("c");
        myArrayList.add("c++");
        myArrayList.add("python");
        myArrayList.add("java");
        System.out.println(myArrayList);

//        myArrayList.add(2,"Go");
//        System.out.println(myArrayList);

        String result = myArrayList.remove(0);
        System.out.println(result);
        System.out.println(myArrayList);

    }
}
