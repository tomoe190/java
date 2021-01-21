package Test1_21;

public class Cat extends Animal{

    @Override
    public Cat eat(String food){
        System.out.println("Cat 正在吃" + food);
        return null;
    }
}
