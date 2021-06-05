package lesson1;

public class JavaProcess {
    public static void main(String[] args) {
        A a = new A(){
            @Override
            public void pro(){
                System.out.println("pro");
            }
        };
        a.pro();

        B b = new B(){
            @Override
            public void pro(){
                System.out.println("a pro");
            }
        };
        b.pro();
    }

    // 静态内部类
    static class A {
        public void pro(){
            System.out.println("a pro");
        };
    }

    // 内部接口
    interface B {
        void pro();
    }

}
