package Test1_26_LibraryManagementSystem.Operation;

import Test1_26_LibraryManagementSystem.Book;
import Test1_26_LibraryManagementSystem.BookList;

import java.util.Scanner;


public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("新增书籍 >> ");
        System.out.println("请输入新增书籍的书名：");
        String name = scanner.next();
        System.out.println("请输入新增书籍的作者姓名：");
        String author = scanner.next();
        System.out.println("请输入新增书籍的价格：");
        double price = scanner.nextDouble();
        System.out.println("请输入新增书籍的类型：");
        String type = scanner.next();
        Book newBook = new Book(name,author,price,type);
        int curSize = bookList.getSize();
        bookList.setBook(curSize,newBook);
        bookList.setSize(curSize + 1);
        System.out.println("新增书籍成功！");
    }
}
