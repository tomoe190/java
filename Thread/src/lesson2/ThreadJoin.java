package lesson2;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        test2();
    }

    public static void test1() throws InterruptedException {
        Thread t = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("t run");
            }
        });
        t.start();
        t.join(); // main线程一直阻塞等待，直到t线程执行完毕，main线程再执行
        System.out.println("main run");
    }

    public static void test2() throws InterruptedException {
        Thread t = new Thread(new Runnable(){
            @Override
            public void run(){
                try {
                    System.out.println("t start");
                    Thread.sleep(3000);
                    System.out.println("t end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        t.join(); // main线程一直阻塞等待，直到t线程执行完毕，main线程再执行
        System.out.println("main run");
    }
}
