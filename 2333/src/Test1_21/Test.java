package Test1_21;

import org.w3c.dom.css.Rect;

public class Test {
    public static void main(String[] args) {
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

        Shape shape = new Circle();
        Shape shape1 = new Triangle();
        Shape shape2 = new Flower();

        draw2(shape);
        draw2(shape1);
        draw2(shape2);

//        Shape[] shapes = {
//                new Circle(),
//                new Flower(),
//                new Triangle(),
//        };
//        for (Shape shape:shapes) {
//            draw2(shape);
//        }
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
