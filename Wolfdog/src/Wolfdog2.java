
public class Wolfdog2 {

	String name;
	int age;
	String color;
	public Wolfdog2() {
	}
	public void back() {
		System.out.println("Wolfdog back");
	}
	public String barkReturn(String name) {
		System.out.println("Wolfdog bark.Named "+name);
		return name;
	}
	
	public static void main(String[] args) {
		Wolfdog2 dog=new Wolfdog2();
		String name1="teddy";
		String name2=dog.barkReturn(name1);
		System.out.println(name2);
	}
}
