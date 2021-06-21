package lesson5;

/**
 * 面包店：
 *  1、面包店（面包师傅-线程）：5个师傅，每人每次生产3个面包
 *  2、消费者（线程）：10个消费者，每人每次消费1个面包
 *  库存（共享变量）：下限是0，上限是100
 */
public class BreadShop {
    // 库存
    private static int COUNT;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable(){//面包师傅
                @Override
                public void run() {
                    try {
                        while(true){//不停的生产面包
                            //面包师傅之间，面包师傅和消费者之间
                            //都是对库存共享变量的操作，需要保证线程安全
                            synchronized (BreadShop.class){
                                //当前库存+当次生产数量如果超过库存上限，需要等待
                                while(COUNT + 3 > 100){
                                    BreadShop.class.wait();
                                }
                                //如果满足生产条件，就生产面包
//                                if(COUNT + 3 > 100){
//                                    BreadShop.class.wait();
//                                }
                                COUNT += 3;
                                //生产后，需要通知消费者线程
                                BreadShop.class.notifyAll();
                                System.out.println(Thread.currentThread().getName()+"生产面包，库存："+COUNT);
                            }
                            Thread.sleep(500);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            },"面包师傅["+i+"]").start();
        }

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable(){//消费者
                @Override
                public void run() {
                    try {
                        while(true){// 不停的消费面包
                            // 面包师傅之间，面包师傅和消费者之间
                            // 都是对库存共享变量的操作，需要保证线程安全
                            synchronized (BreadShop.class){
                                // 当前库存-当次消费数量如果小于库存下限，需要等待
                                while(COUNT == 0){
                                    BreadShop.class.wait();
                                }
                                // 如果满足消费条件，就消费面包
//                                如果用 if(COUNT == 0){
//                                    BreadShop.class.wait();
//                                }
                                // 当它再次竞争到时间片，它就会继续往下执行
                                COUNT --;
                                // 生产后，需要通知生产者线程
                                BreadShop.class.notifyAll();
                                System.out.println(Thread.currentThread().getName()+"消费面包，库存："+COUNT);
                            }
                            Thread.sleep(500);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            },"消费者["+i+"]").start();
        }
    }
}
