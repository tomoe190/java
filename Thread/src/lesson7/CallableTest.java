package lesson7;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Callable为任务描述，提供了任务执行完毕的返回结果
        Callable<Integer> c = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println(1);
                return 2;
            }
        };
        // Future/FutureTask，构造时，传入一个Callable对象，本身是Runnable实现类
        FutureTask<Integer> task = new FutureTask(c);

        new Thread(task).start();
        System.out.println(3);
        //Future/FutureTask.get()：当前线程阻塞等待，直到子线程执行完毕，返回结果
        System.out.println(task.get());


//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(1);
//            }
//        }).start();
//        System.out.println(2);


        ExecutorService pool = Executors.newCachedThreadPool();

        pool.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
        pool.submit(new Runnable() {
            @Override
            public void run() {

            }
        });
        Future<String> future = pool.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(1);
                return "2";
            }
        });
        future.get();



    }
}
