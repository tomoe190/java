package Test1_25;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = scanner.next();
        System.out.println("请输入密码");
        String password = scanner.next();
        try {
            login(name,password);
        } catch (NameException | PasswordException e) {
            e.printStackTrace();
        }
    }

    public static void login(String name, String password) throws NameException, PasswordException {
        if (! name.equals("admin")){
            throw new NameException("用户名错误");
        }
        if (! password.equals("666666")){
            throw new PasswordException("密码错误");
        }
    }
}
