package lseeon3;

public class SynchronizedThread {
    private static int COUNT;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable(){
                @Override
                public void run(){
                    for (int j = 0; j < 1000; j++) {
                        increment1();
                    }
                }
            }).start();
        }
        while(Thread.activeCount()>1) Thread.yield();
        System.out.println(COUNT);
    }

    private synchronized static void increment1() {
        COUNT++;
    }

    private static void increment2() {
        synchronized(SynchronizedThread.class){
            COUNT++;
        }
    }

    private static void increment3() {
        Object o = new Object();
        synchronized(o){
            COUNT++;
        }
    }
}
