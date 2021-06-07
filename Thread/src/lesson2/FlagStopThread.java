package lesson2;

public class FlagStopThread {

    //使用标志位标识是否继续执行线程中的任务，true中断，false继续执行
    private static volatile boolean isStop = false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开始转账");
                try {
                    while (!isStop){
                        System.out.println("转账ing...");
                        Thread.sleep(10000);
                    }
                    System.out.println("停止转账");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Thread.sleep(3*1000);
        //发现是诈骗犯，需要停止转账
        isStop = true;
    }

    public static class ThreadAdv {

        public static void main(String[] args) {
            //循环10亿次，每次++运算
            //1.串行的方式：main线程运行两次
            long start = System.nanoTime();
            for (int i = 0; i < 5; i++) {
                loop();
            }
    //        loop();
            long end = System.nanoTime();
            System.out.printf("串行执行耗时：%s毫秒%n", (end-start)/1000/1000);

            //2.并行的方式：main线程，子线程同时执行loop方法
            long start2 = System.nanoTime();
            for (int i = 0;i < 5;i ++) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        loop();
                    }
                }).start();
            }
    //        loop();
            //计算时间，需要让子线程，main线程loop都执行完
            //当前main和main线程中创建的子线程，活跃线程数>1，main线程就一直让步
            //子线程执行完，main线程才能继续向下执行
            //使用activeCount在idea要用debug方式运行
            while(Thread.activeCount()>1) Thread.yield();
            long end2 = System.nanoTime();
            System.out.printf("并行执行耗时：%s毫秒%n", (end2-start2)/1000/1000);
        }
        private static void loop(){
            int m = 0;
            for (long i = 0; i < 10_0000_0000L; i++) {
                m++;
            }
        }
    }
}
