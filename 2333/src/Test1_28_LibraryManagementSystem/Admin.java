package Test1_28_LibraryManagementSystem;

import Test1_28_LibraryManagementSystem.IOperation.*;

import java.util.Scanner;

public class Admin extends User{

    public Admin(String name) {
        this.name = name;
        this.operations = new IOperation[]{
                new AddOperation(),
                new DelOperation(),
                new DisplayBookList(),
                new FindOperation(),
                new ExitOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("*********************");
        System.out.println(" 1、新增书籍 ");
        System.out.println(" 2、删除书籍 ");
        System.out.println(" 3、展示书籍列表 ");
        System.out.println(" 4、查找某本书籍 ");
        System.out.println(" 5、退出系统 ");
        System.out.println("*********************");
        System.out.println("请输入您的选择：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
