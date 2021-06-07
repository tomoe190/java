package lesson2;

public class InterruptedResetFlag {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test1(){
        Thread t = new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < 10; i++) {
                    // 普通打印10次标志位的值
                    System.out.println(Thread.currentThread().isInterrupted());
                }
                // 打印结果：10次都是true
            }
        });
        t.start();
        t.interrupt();
    }

    public static void test2(){
        Thread t = new Thread(new Runnable(){
            @Override
            public void run(){
                // 标志位=true
                for (int i = 0; i < 10; i++) {
                    // i=0时，打印标志位=true，之后重置标志位=false
                    System.out.println(Thread.interrupted());
                }
                // 打印结果：第1次true，之后9次false
            }
        });
        t.start();
        t.interrupt(); // 标志位=true
    }
}
