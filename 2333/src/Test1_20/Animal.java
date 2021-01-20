package Test1_20;

public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

//    public Animal(){
//
//    }

    public void eat(String food){
        System.out.println(name + "正在吃" + food);
    }
}
