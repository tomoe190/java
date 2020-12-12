public class Test12_12 {
    public static void main(String[] args) {
        int count = 0;
        for (int year = 1000; year <= 2000; year++) {
            if(year%100==0){
                System.out.println();
            }
            if (year % 100 == 0 ){
                if (year % 400 == 0 ){
                    System.out.print(year+" ");
                    count++;
                }
            }  else {
                if (year % 4 == 0) {
                    System.out.print(year+" ");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("1000~2000年间闰年的个数："+count);
    }

//        int count=0;
//        for (int num = 1; num <100; num++) {
//            if(num%10==9){
//                count++;
//            }
//            if(num/10==9){
//                count++;
//            }
//        }
//        System.out.println(count);
    }