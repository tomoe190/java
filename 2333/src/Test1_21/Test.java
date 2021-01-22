package Test1_21;

import org.w3c.dom.css.Rect;

import java.util.Arrays;

public class Test {
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Animal animal = null;
//        animal = cat;

//        Animal animal = new Cat();
//        animal.eat("鱼");
////        Bird bird = new Bird();
//        System.out.println(animal.getGender());

        //向上转型，也可能发生在方法传参的过程中
        //方法传参，本质上也就是在进行“赋值”操作
//        func(new Cat());

        // 向上转型，也可能发生在方法返回的时候
//        Animal animal = func2();

//        Shape shape = new Circle();
//        Shape shape1 = new Triangle();
//        Shape shape2 = new Flower();
//
//        draw2(shape);
//        draw2(shape1);
//        draw2(shape2);

//        Shape[] shapes = {
//                new Circle(),
//                new Flower(),
//                new Triangle(),
//        };
//        for (Shape shape:shapes) {
//            draw2(shape);
//        }
//        int[] arr = {9,5,2,7,3,6};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));

        public static void main(String[] args) {
            B a = new B();
            B b = new D();
            a.Func();
            b.Func();
        }

//    }

    public static void bubbleSort(int[] arr) {
        //从后往前遍历
        //外层循环遍历的次数
        //已排区间[0，bound）
        //待排区间[bound，length）
        for (int bound = 0; bound <arr.length - 1; bound++) {
            //里层循环，比较交换
            for (int cur = 0; cur < arr.length - 1 - bound; cur++) {
                if(arr[cur] > arr[cur + 1]){
                    //不符合排序要求
                    int tmp = arr[cur];
                    arr[cur] = arr[cur + 1];
                    arr[cur + 1] = tmp;
                }
            }
        }
    }

    static class B {
        public int Func() {
            System.out.print("B");
            return 0;
        }
    }
    static class D extends B {
        @Override
        public int Func() {
            System.out.print("D");
            return 0;
        }
    }




    public static int add(int a,int b){
        return a + b;
    }

    public static double add(int a,double b){
        return 0;
    }

    public static void draw2(Shape shape){
        shape.draw();
    }

    public static void func(Animal animal){

    }
    public static Animal func2(){
        return new Cat();
    }
}
