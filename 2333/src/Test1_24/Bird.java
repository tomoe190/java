package Test1_24;

public class Bird extends Animal implements IRunning,IFlying{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void run(){
        System.out.println(name + "一跳一跳");
    }

    @Override
    public void fly() {
        System.out.println(name + "正在飞");
    }
}
