package Test1_28_LibraryManagementSystem;

import Test1_28_LibraryManagementSystem.IOperation.*;

import java.util.Scanner;

public class NormalUser extends User{

    public NormalUser(String name) {
        this.name = name;
        this.operations = new IOperation[]{
                new BorrowOperation(),
                new ReturnOperation(),
                new FindOperation(),
                new ExitOperation()
        };
    }

    public int menu(){
        System.out.println("*********************");
        System.out.println(" 1、借阅书籍 ");
        System.out.println(" 2、归还书籍 ");
        System.out.println(" 3、查找某本书籍 ");
        System.out.println(" 4、退出系统 ");
        System.out.println("*********************");
        System.out.println("请输入您的选择：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
