package Test1_26_LibraryManagementSystem;

import Test1_26_LibraryManagementSystem.Operation.*;

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

    @Override
    public int menu() {
        System.out.println("*********************");
        System.out.println("Hello! " + ",欢迎使用！");
        System.out.println(" 1. 借阅书籍 ");
        System.out.println(" 2. 归还书籍 ");
        System.out.println(" 3. 查阅书籍信息 ");
        System.out.println(" 4. 退出系统 ");
        System.out.println("*********************");
        System.out.println("请输入你的选择：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}

