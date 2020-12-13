import java.util.Scanner;

public class Test12_12 {
    public static void main(String[] args) {
        System.out.println("请输入你要打印的X的高度：");
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
        int col=scanner.nextInt();
        for (int i = 0; i <col; i++) {
            for (int j = 0; j <col; j++) {
                if (i == j || i + j == col - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
    }

        //根据输入的年龄, 来打印出当前年龄的人是少年(低于18),
        // 青年(19-28), 中年(29-55), 老年(56以上)
//        int old=77;
//        int i=0;
//        if(old<=18){
//            i=1;
//        }
//        else if(19<=old && old<=28){
//            i=2;
//        }
//        else if(29<=old && old<=55){
//            i=3;
//        }
//        else{
//            i=4;
//        }
//        switch(i) {
//            case(1):{
//                System.out.println(old + "是少年。");
//                break;
//            }
//            case(2):{
//                System.out.println(old+"是青年。");
//                break;
//            }
//            case(3):{
//                System.out.println(old+"是中年。");
//                break;
//            }
//            case(4):{
//                System.out.println(old+"是老年。");
//                break;
//            }
//            default:{
//                break;
//            }
//        }
//    }

        //给定一个数字，判定一个数字是否是素数
//        int num=91;
//        int i=0;
//        for (i = 2; i <=91; i++) {
//            if (num % i == 0) {
//                break;
//            }
//        }
//        if(num==i){
//            System.out.println(num+"是素数。");
//        }
//        else{
//            System.out.println(num+"不是素数。");
//        }
//    }

    //打印 1 - 100 之间所有的素数
//        int count=0;
//        for (int i = 2; i <=100; i++) {
//            int j=0;
//            for ( j= 2; j <=i; j++) {
//                if(i%j==0){
//                    break;
//                }
//            }
//            if(i==j){
//                System.out.print(i+" ");
//                count++;
//            }
//        }
//        System.out.println("\n有"+count+"个素数。");
//    }

    //输出 1000 - 2000 之间所有的闰年
//        int count = 0;
//        for (int year = 1000; year <= 2000; year++) {
//            if(year%100==0){
//                System.out.println();
//            }
//            if (year % 100 == 0 ){
//                if (year % 400 == 0 ){
//                    System.out.print(year+" ");
//                    count++;
//                }
//            }  else {
//                if (year % 4 == 0) {
//                    System.out.print(year+" ");
//                    count++;
//                }
//            }
//        }
//        System.out.println();
//        System.out.println("1000~2000年间闰年的个数："+count);
//    }

    //写程序数一下 1到 100 的所有整数中出现多少个数字9
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