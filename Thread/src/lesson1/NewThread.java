package lesson1;

public class NewThread {
    public static void main(String[] args) {
        // 匿名内部类 + Thread的方式创建一个线程
        Thread t = new Thread(){
            @Override
            public void run(){//线程要执行的任务
//                System.out.println("ok");
                while(true){}
            }
        };
        t.start();
        // 继承Thread的方式创建线程
        A a = new A();
        Thread aa = new A();
    }
}

class A extends Thread{
    @Override
    public void run(){
        System.out.println("ok");
    }
}
