
class Circle extends Shape{
	private float radius;
	Circle(float r) {
		radius=r;
	}

	@Override
	public float getPerimeter() {
		// TODO Auto-generated method stub
		return 2*PI*radius;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}
	

}
