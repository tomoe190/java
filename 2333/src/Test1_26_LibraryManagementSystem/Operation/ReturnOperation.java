package Test1_26_LibraryManagementSystem.Operation;

import Test1_26_LibraryManagementSystem.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍 >> ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要归还书籍的书名：");
        String name = scanner.next();
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if(name.equals(bookList.getBook(i).getName())) {
                if(!bookList.getBook(i).isBorrowed()){
                    System.out.println("《" + name + "》未被借阅，归还失败。");
                    return;
                }
                bookList.getBook(i).setBorrowed(false);
                System.out.println("归还成功。");
                return;
            }
        }
        if(i >= bookList.getSize()){
            System.out.println("未找到该书，请确认输入是否正确。");
        }
    }
}
