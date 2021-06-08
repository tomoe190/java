package lseeon3;

import java.util.Objects;

public class ClassVsObject {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        // 判断两个对象是否相等（业务上的）
        System.out.println(p1.equals(p2));
        //判断是否是同一个对象（引用的堆里面的对象，是不是同一个）
        System.out.println(p1==p2);//引用地址判断

        //类加载：new对象，静态方法调用，类.静态变量，
        //      如果没有类加载,就会先进行类加载
        //以上：类加载是运行期执行的，并且执行一次
        //类加载做的事情：
        // （1）把class字节码数据加载到Java进程在的方法区（类信息，方法数据信息）
        // （2）在堆里面，生成一个Class对象
        Class c1 = Person.class;
        Class c2 = Person.class;
        System.out.println(c1==c2);//true
    }

    static class Person{
        String name;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        public void print(){
            System.out.println(this);
        }
    }
}
