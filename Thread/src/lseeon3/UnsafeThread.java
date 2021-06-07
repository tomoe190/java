package lseeon3;


public class UnsafeThread {
    private static int COUNT;
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable(){
                @Override
                public void run(){
                    COUNT ++;
                }
            }).start();
        }
        while(Thread.activeCount()>1) Thread.yield();
        System.out.println(COUNT);
    }
}
