package Test1_23;

class A{
    public A(){
        func();
    }

    public void func(){
        System.out.println("A.func");
    }
}
class B extends A{
    private int num = 1;

    @Override
    public void func(){
        System.out.println("B.func" + num);
    }
}

public class Test2 {
    public static void main(String[] args) {
        B b = new B();
    }

}
