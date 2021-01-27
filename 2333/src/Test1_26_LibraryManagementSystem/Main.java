package Test1_26_LibraryManagementSystem;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 准备书籍数据
        BookList bookList = new BookList();
        // 2 创建用户（确认身份）
        User user = login();
        // 3 主循环
        while(true){
            // user 是父类的引用，调用的 menu 是哪个版本的方法
            // 就看user到底指向哪种子类的实例
            // 多态，调用者无需关注user到底是什么
            int choice = user.menu();
            // 有了用户输入的选择之后，需要根据这个选项，来执行对应的操作
            user.doOperation(choice,bookList);
        }
    }

    private static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        String name = scanner.next();
        System.out.println("请输入您的角色：0、管理员 1、普通用户");
        int who = scanner.nextInt();
        if(who == 0){
            return new Admin(name);
        }
        return new NormalUser(name);

    }
}
