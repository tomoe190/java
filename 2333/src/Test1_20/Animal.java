package Test1_20;

public class Animal {
    public String name;

    Animal() {
        System.out.println("b");
    }

//    public Animal(){
//
//    }

    public void eat(String food){
        System.out.println(name + "正在吃" + food);
    }
}
