import java.util.Scanner;

public class Test1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数并以回车结尾：");

        int sum = 0;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            System.out.println("输入的数为：" + num);
            sum += num;
        }
        System.out.println("和为" + sum);
    }
}
