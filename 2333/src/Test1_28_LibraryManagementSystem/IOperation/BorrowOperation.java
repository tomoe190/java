package Test1_28_LibraryManagementSystem.IOperation;

import Test1_28_LibraryManagementSystem.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍 >> ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要借阅书籍的书名：");
        String name = scanner.next();
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if(name.equals(bookList.getBook(i).getName())) {
                if(!bookList.getBook(i).isBorrowed()) {
                    bookList.getBook(i).setBorrowed(true);
                    System.out.println("借阅成功");
                    return;
                }
                System.out.println("《" + name + "》已被借阅，借阅失败");
                return;
            }
        }
        if(i >= bookList.getSize() - 1) {
            System.out.println("未找到 《" + name + "》，借阅失败");
        }
    }
}
