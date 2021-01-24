package Test1_24;

public class Frog extends Animal implements IAmphibious{
    public Frog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + "正在蹦跶蹦跶的跑");
    }

    @Override
    public void swim() {
        System.out.println(name + "正在蛙泳");
    }
}

