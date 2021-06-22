package lesson6;

import java.util.concurrent.atomic.AtomicInteger;

public class SafeAdd {
    
    public static AtomicInteger COUNT = new AtomicInteger();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0;i < 1000; i++) {
                        COUNT.incrementAndGet();
                    }
                }
            }).start();
   
            
}
