package lesson1;

public class NewRunnable {
    public static void main(String[] args) {
        // 使用Runnable接口创建一个任务，再创建线程
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("ok");
            }
        };
        Thread t = new Thread(r);

        //以上合并的写法
        Thread tt = new Thread(new Runnable(){
            @Override
            public void run(){
                while(true){}
            }
        },"tt");
//        tt.start();
        tt.run();
    }
}
