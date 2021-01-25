package Test1_25;

public class Test {
    public static void main(String[] args) {
//        Integer ret = divide(10,0);
//        if (ret == null){
//            System.out.println("除法操作失败");
//        }else {
//            System.out.println(ret);
//        }
//        try{
//            int ret = divide(10,0);
//        }catch(ArithmeticException e){
//            e.printStackTrace();
//        }
//        System.out.println("hello");
        System.out.println(func1());
    }

    private static int func1() {
        try{
            return 10;
        }finally{
            return 20;
        }

    }

    public static int divide(int x,int y) throws ArithmeticException{
        if (y == 0){
//            return null;
            throw new ArithmeticException("此处抛出一个算术异常");
        }
        return x / y;
    }
}
