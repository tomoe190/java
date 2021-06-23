package lesson6;

import lesson5.MyBlockingQueue;

public class MyThreadPool {

    private MyBlockingQueue<Runnable> queue = new MyBlockingQueue<>(100);

    // 传入的核心线程数来创建工作线程，创建线程池就启动
    public MyThreadPool(int coreSize){
        for (int i = 0; i < coreSize; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            Runnable task = queue.take();//从仓库取任务
                            task.run();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    public void execute(Runnable task) {
        try {
            queue.put(task);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThreadPool pool = new MyThreadPool(4);
        for (int i = 0; i < 10; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(1);
                        Thread.sleep(999999);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
