public class PeopleDemo {
    public static  void main(String[] args){

        People person=new People("型老太太",80,100);
        System.out.println(person.toString());
       // person.age=50;
        person.num=200;
        System.out.println(person.toString());
        person.setAge(50);
        System.out.println(person.toString());
        System.out.println(person.getAge());
    }
}

