package Test1_24;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 0;
//        System.out.println(a / b);

//        int[] a = {1,2,3};
//        System.out.println(a[100]);

//        try {
//            System.out.println("try 中异常之前的代码");
//            int [] a = {1,2,3};
//            System.out.println(a[0]);
//            System.out.println("try 中异常之后的代码");
//        } catch (Exception e) {
//            System.out.println("catch 空指针异常");
//        }finally{
//            System.out.println("finally 中的代码");
//        }
//        System.out.println("hello");

//        Scanner scanner = null;
//        try {
//            scanner = new Scanner(System.in);
//        }catch (NullPointerException e){
//            System.out.println("空指针异常");
//        }finally {
//            scanner.close();
//        }


//        try (Scanner scanner = new Scanner(System.in)){
//        }catch(NullPointerException e){
//            System.out.println("空指针异常");
//        }

//        try {
//            func1();
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("数组下标越界异常");
//        }
//        ((TestException) null).testMethod();
        

    }
    private static void testMethod() {

        System.out.println("testMethod");

    }

//    public static void func1(){
//        try {
//            func2();
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("数组下标越界异常");
//        }
//    }
//
//    private static void func2() {
//            int[] a = {1,2,3};
//            System.out.println(a[100]);
//    }

}