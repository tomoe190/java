public class Test1_9 {
    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10.5,20.5));
        System.out.println(add(10,20,30));
    }

    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }


//    public static void main(String[] args) {
//    //调试观察栈帧变化
//        int result = 0;
//        for (int i = 1; i <=5; i++) {
//            result +=factor(i);
//        }
//        System.out.println(result);
//    }
//
//    public static int factor(int number) {
//        int result = 1;
//        for (int i = 1; i <=number; i++) {
//            result *= i;
//        }
//        return result;
//    }
}
