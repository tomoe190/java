package lesson2;

public class ThreadSeq {
    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName());
            }
        },"子线程").start();
//        Thread.currentThread();
        System.out.println(Thread.currentThread().getName());
    }
}
