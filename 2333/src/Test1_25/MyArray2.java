package Test1_25;

public class MyArray2<E> {
    private Object[] data = null;
    private int size = 0;
    private int capacity = 10;

    public MyArray2() {
        // 错误
//        data = new E[capacity];
        data = new Object[capacity];
    }

    public void add(E data){
        if (size >= capacity){
            return;
        }
        this.data[size++] = data;
    }

    public Object get(int index){
        return this.data[index];
    }

    public static void main(String[] args) {
//        MyArray2<String> myArray2 = new MyArray2<>();
//        myArray2.add("hello");
//        String str = myArray2.get(0);
//
//        MyArray2<Integer> myArray3 = new MyArray2<>();
//        myArray3.add(1);
//        myArray3.add(2);
//        Integer ret = myArray3.get(0);

//        MyArray2<Animal> myArray2 = new MyArray2<>();
//        MyArray2<Cat> myArray21 = new MyArray2<>();
        }

    }

