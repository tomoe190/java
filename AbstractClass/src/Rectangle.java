
class Rectangle extends Shape {
	private float length;
	private float width;
	public Rectangle(float length,float width) {
		this.length=length;
		this.width=width;
	}
	@Override
	public float getPerimeter() {
		// TODO Auto-generated method stub
		return (length+width)*2;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return length*width;
	}

}
