package lesson2;

public class DaemonThread {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){}
            }
        });
        t.setDaemon(true);
        t.start();
    }
}
