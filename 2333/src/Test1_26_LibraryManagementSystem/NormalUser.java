package Test1_26_LibraryManagementSystem;

import Test1_26_LibraryManagementSystem.Operation.*;

import java.util.Scanner;

public class NormalUser extends User{

    public NormalUser(String name) {
        // 外部传入，通过构造方法的参数
        this.name = name;
        // 向上转型
        // 直接写死
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
        System.out.println("Hello! " + name + ",欢迎使用！");
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

