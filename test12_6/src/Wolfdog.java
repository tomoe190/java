public class Wolfdog {
    String name;
    int age;
    String color;

    //无参构造函数
    public Wolfdog() {
    }

    //无参数返回的方法
    public void bark(){
        System.out.println("Wolfdog bark.");
    }

    public String barkReturn(String name){
        System.out.println("Wolfdog bark.Named "+name);
        return name;
    }

    public static void main(String[] args) {
        Wolfdog dog=new Wolfdog();
        dog.bark();
        String name1="teddy";
        String name2=dog.barkReturn(name1);
        System.out.println(name2);
    }
}
