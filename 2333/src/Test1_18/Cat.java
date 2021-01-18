package Test1_18;

public class Cat {
    String name;
    String gender;

    public Cat(String name, String gender) {
        this.name = name;
        this.gender = gender;

        this.eat("鱼");
    }

    public void eat(String food){
        System.out.println(name + "正在吃" + food);
    }

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
