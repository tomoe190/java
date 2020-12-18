public class Test12_18 {
    public static void main(String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99-1/100
        double result=calcSeries(100);
        System.out.println(result);
    }
    public static double calcSeries(int bound) {
        //这个方法中只考虑项和项的求和
        double result=0;
        for (int i = 1; i <= bound; i+=2) {
            result += calcItem(i);
        }
        return result;
    }
    public static double calcItem(int i) {
        return 1.0/i-1.0/(i+1);
    }
}
