public class PeopleDemo {
    public static  void main(String[] args){

        People person=new People("张三",15,100);
        System.out.println(person.toString());
        person.age=50;
        person.num=200;
        System.out.println(person.toString);
        person.setAge(50);
        System.out.println(person.toString());
        System.out.println(person.getAge());
    }

    class People{
        private String name;
        private int age;
        public int num;
    }

    public People(String name,int age,int num){
        this.name=name;
        this.age=age;
        this.num=num;
    }

    
}
