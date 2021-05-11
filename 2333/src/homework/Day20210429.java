package homework;


import java.util.Scanner;

class A {
    public A(String str) {

    }
}

public class Day20210429 {
    public static void main(String[] args) {
//        A classa = new A ("he");
//        A classb = new A ("he");
//        System.out.println(classa == classb);

//        int a = 10;
//        double b = 3.14;
//        System.out.println('a' + a + b);

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            int ret = numberOf1(num);
            System.out.println(ret);
        }

    }

    private static int numberOf1(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count ++;
            }
            num = num >>> 1;
        }
        return count;
    }
}
