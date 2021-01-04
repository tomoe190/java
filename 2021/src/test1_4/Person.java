package test1_4;

//一个.java文件中允许有多个类。
//其中得有一个（不能是多个）用public修饰的类
//这个类名字必须和文件名严格相同
//多数情况下，一个文件中只有一个类
public class Person {//shift+F6重构功能，全部涉及到的都会改变
    // 属性/成员变量/字段
    // 直接写在类里面的变量就是成员变量
    //写在方法中的变量就是局部变量
    //public 也可以放到成员变量之前
    public String name;
    int age;
    String gender;

    // 方法/成员函数
    public void eat(String food){
        System.out.println(name+"正在吃"+food);
    }
}
