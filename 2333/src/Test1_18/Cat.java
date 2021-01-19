package Test1_18;

public class Cat {
    String name;
    String gender;

    static {
        //静态代码块
        //静态代码块，只在类加载的时候执行一次
        System.out.println("这是静态代码块。");
    }

    {
        System.out.println("这是普通代码块。");
    }


    public static int n = 0;

//    public static void func(){
//        System.out.println("这是static 修饰的方法");
//        this.name;    错误
//    }

    public Cat(String name, String gender) {
        this.name = name;
        this.gender = gender;

//        this.eat("鱼");
    }

//    public void eat(String food){
//        System.out.println(name + "正在吃" + food);
//    }

//    public String toString(){
//        return this.name + "," + this.gender;
//    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
