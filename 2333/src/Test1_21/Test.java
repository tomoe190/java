package Test1_21;

public class Test {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Animal animal = null;
//        animal = cat;

        Animal animal = new Cat();
        animal.eat("鱼");
//        Bird bird = new Bird();

        //向上转型，也可能发生在方法传参的过程中
        //方法传参，本质上也就是在进行“赋值”操作
//        func(new Cat());

        // 向上转型，也可能发生在方法返回的时候
//        Animal animal = func2();

    }
    public static void func(Animal animal){

    }
    public static Animal func2(){
        return new Cat();
    }
}
