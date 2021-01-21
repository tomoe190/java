package Test1_21;

public class Cat extends Animal{
    String gender = "公猫";

    @Override
    public String getGender(){
        return gender;
    }

    @Override
    public Cat eat(String food){
        System.out.println("Cat 正在吃" + food);
        return null;
    }
}
