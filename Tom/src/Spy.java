
public class Spy extends Person implements SpySkills,Driver,Teacher {

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("Teaching Geography...");
	}

	@Override
	public void driverCar() {
		// TODO Auto-generated method stub
		System.out.println("Driving for escape...");
	}

	@Override
	public void stealInfo() {
		// TODO Auto-generated method stub
		System.out.println("Stealing Informations...");
	}

	@Override
	public void crackingPasswords() {
		// TODO Auto-generated method stub
		System.out.println("Cracking Passwords...");
	}
	
	public void userComputer() {
		System.out.println("Operating computer...");
	}
	public void learn(String knowledgeType) {
		//学习传入的类型的知识
	}

}
