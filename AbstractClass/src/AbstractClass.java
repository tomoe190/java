
public class AbstractClass {
	public static void main(String[] args) {
		Rectangle rect=new Rectangle(2,3);
		Circle c=new Circle(3);
		System.out.println("长方形的周长是："+rect.getPerimeter()+",面积是："+rect.getArea());
		System.out.println("圆的周长是："+c.getPerimeter()+"面积是："+c.getArea());
	}

}
