package Test1_24;

public class Duck extends Animal implements IRunning,IFlying,ISwimming{
    public Duck(String name) {
        super(name);
    }


    @Override
    public void fly() {
        System.out.println(name + "正在飞");
    }

    @Override
    public void run() {
        System.out.println(name + "一摇一摆的跑");
    }

    @Override
    public void swim() {
        System.out.println(name + "啪踏啪踏的游");
    }
}
