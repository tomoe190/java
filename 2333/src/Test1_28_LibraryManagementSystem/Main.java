package Test1_28_LibraryManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
        while (true) {
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }

    }

    private static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        String name = scanner.next();
        System.out.println(name + "欢迎使用！");
        System.out.println("请选择您的身份：");
        System.out.println(" 0、管理员  1、用户 ");
        int who = scanner.nextInt();
        if(who == 0){
            return new Admin(name);
        }
        return new NormalUser(name);
    }
}
