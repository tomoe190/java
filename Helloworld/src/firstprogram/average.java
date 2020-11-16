package firstprogram;

public class average {
	static class Caculator{
		public static double getAverage(double x,double y,double z) {
			double sum=0.0;
			sum=x+y+z;
			return sum/3;
		}
		
	}

	public static void main(String[] args) {
		double a=12,b=20,c=35,ave;
		ave=Caculator.getAverage(a,b,c);
		System.out.println("这三个数的平均值是"+ave);

	}

}
