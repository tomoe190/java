package Test1_25;

public class MyArray {
    private Object[] data = null;
    private int size = 0;
    private int capacity = 10;

    public MyArray() {
        data = new Object[capacity];
    }

    public void add(Object data){
        if (size >= capacity){
            return;
        }
        this.data[size++] = data;
    }

    public Object get(int index){
        return data[index];
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.add(new Person("奈奈生",18));
        myArray.add(new Person("鞍马",19));
        myArray.add(new Person("瑞希",19));
        Person person = (Person) myArray.get(0);

        MyArray myArray2 = new MyArray();
        myArray2.add("hello");
        myArray2.add("java");
        String str = (String) myArray2.get(0);

        MyArray myArray3 = new MyArray();
        myArray3.add(1);
        Integer integer = (Integer)myArray3.get(0);
    }
}
