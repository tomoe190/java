package Test1_26_LibraryManagementSystem;

import Test1_26_LibraryManagementSystem.Operation.*;

import java.util.Scanner;

public class Admin extends User{

    public Admin(String name) {
        this.name = name;
        this.operations = new IOperation[]{
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),
                new FindOperation(),
                new ExitOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("*********************");
        System.out.println("Hello! " + name + ",欢迎使用！");
        System.out.println(" 1. 新增书籍信息 ");
        System.out.println(" 2. 删除书籍信息 ");
        System.out.println(" 3. 打印书籍列表 ");
        System.out.println(" 4. 查看书籍信息 ");
        System.out.println(" 5. 退出系统 ");
        System.out.println("*********************");
        System.out.println("请输入你的选择：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
