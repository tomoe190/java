import Test1_25.Cat;

import java.lang.reflect.Field;
import java.util.Arrays;

import static sun.plugin.util.ProgressMonitor.get;

public class Test1_29_String {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        String a = "hello";
//        String b = "hello";
//        System.out.println(a == b);
//        System.out.println(a.equals(b));
//        String c = new String("hello");
//        System.out.println(a == c);
//        System.out.println(a.equals(c));

//        String a = null;
//        if(a.equals("hello")) {
//        }
//        if(("hello").equals(a)) {
//
//        }

//        String a = "hello";
//        String b = new String("hello").intern();
//        System.out.println(a == b);


        // 反射
//        String a = "hello";
//
//        // 1）获取到 String 的类对象
//        // 2）根据 ”value“ 这个字段名字，在类对象中拿到对应的字段
//        // (仍然是图纸的一部分)
//        Field valueField = String.class.getDeclaredField("value");
//        // 让 value 这个 private 的成员也可以被访问到
//        valueField.setAccessible(true);
//        // 3）根据图纸，把 a 这个对象给拆开，取出里面的零件
//        char[] value = (char[])valueField.get(a);
//        // 4) 修改零件内容
//        value[4] = 'a';
//        System.out.println(a);

//        //
//        char[] value = {'a','b','c'};
//        String s = new String(value);
//        //
//        String a = "abcd";
//        System.out.println(a.charAt(0));
//        System.out.println(a.charAt(1));
//        System.out.println(a.charAt(2));
//        System.out.println(a.charAt(3));
//        System.out.println(a.intern());
//        // 相当于重新创建了一个新的字符数组并返回
//        // 修改这个返回值，不会影响到 a 本身的内容
//        char[] value2 = a.toCharArray();
//        for(char v: value){
//            System.out.println(v);
//        }
//        value[0] = 'x';
//        // 并未改变
//        System.out.println(a);

        // 字节=>字符串
        // 字节数组来构造字符串，需要字节数组中保存的内容符合Java字符的编码方式
//        byte[] value = {'a','b','c'};
//        String s = new String(value);
//        System.out.println(s);

        //字节=>字符串
        // 把字符串的内容拷贝一份，放到字节数组中
        String s = "hello";
        s.getBytes();

//        String a = "Hello";
//        String b = "hallo";
//        // a 比 b 大，返回 >0 的结果
//        // a 比 b 小，返回 <0 的结果
//        // a 和 b 相等，返回 0
//        // (是任意的数，并不是只是 0、1、-1)
//        int result = a.compareTo(b);   // 小于 0 的结果
//        int result2 = a.compareToIgnoreCase(b);  // 0

//        String a = "hello world";
//        String b = "hello";
//        int result = a.indexOf(b);
//        System.out.println(a.indexOf(b));
//        result = a.indexOf(b,result + 1);
////      System.out.println(result);
//        String result = a.replaceFirst(b,"java");
//        System.out.println(result);
//        System.out.println(a);

//        String a = "hello world java";
//        String[] result = a.split(" ");
//        System.out.println(Arrays.toString(result));

//        String b = "192.168.1.1";
//        String[] result = b.split("\\.");
//        System.out.println(Arrays.toString(result));

//        String a = "hello world java";
//        System.out.println(a.substring(6,11));

//        String a = "      hello world    \n";
//        System.out.println(a.trim());

//        String a = "Hello";
//        System.out.println(a.toUpperCase());
//        System.out.println(a.toLowerCase());

//        String a = "hello world";
//        String b = "hello";
//        System.out.println(a.lastIndexOf(b));

//        StringBuilder stringBuilder = new StringBuilder("hello");
//        stringBuilder.reverse();
//        System.out.println(stringBuilder.toString());
//        stringBuilder.delete(2,4);
//        stringBuilder.insert(2,"world");


    }
}
