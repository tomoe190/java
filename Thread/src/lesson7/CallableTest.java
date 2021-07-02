package lesson7;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) {
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

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(1);
//            }
//        }).start();
//        System.out.println(2);
    }
}
