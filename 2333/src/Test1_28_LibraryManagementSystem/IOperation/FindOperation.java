package Test1_28_LibraryManagementSystem.IOperation;

import Test1_28_LibraryManagementSystem.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("查找某本书籍信息 >> ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找书籍的书名：");
        String name = scanner.next();
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if(bookList.getBook(i).getName().contains(name)) {
                System.out.println(bookList.getBook(i));
                System.out.println("查找成功");
                return;
            }
        }
        if(i >= bookList.getSize() - 1) {
            System.out.println("未找到《" + name + "》，查找失败");
        }
    }
}
