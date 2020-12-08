public class Test12_8 {
    public static void main(String[] args) {
        int result=0;
        for (int i = 1; i <=5; i++) {
            int factorResult=1;

            for (int tmp=1; tmp <=i; tmp++) {
                factorResult *= tmp;
            }
            result +=factorResult;
        }
        System.out.println("5!= "+result);




//        int year=2000;
//        if (year%100==0){
//            if(year%400==0){
//                System.out.println(year+" 是闰年。");
//            }else{
//                System.out.println(year+" 不是闰年。");
//            }
//
//        }else{
//            if(year%4==0){
//                System.out.println(year+" 是闰年。");
//            }else{
//                System.out.println(year+" 不是闰年。");
//            }
//        }

    }
}
