package Test1_28_LibraryManagementSystem.IOperation;

import Test1_28_LibraryManagementSystem.Book;
import Test1_28_LibraryManagementSystem.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书 >> ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要新增书籍的书名：");
        String name = scanner.next();
        System.out.println("请输入书籍作者的名字：");
        String author = scanner.next();
        System.out.println("请输入书籍的价格：");
        Double price = scanner.nextDouble();
        System.out.println("请输入书籍的类型：");
        String type = scanner.next();
        Book newBook = new Book(name,author,price,type);
        bookList.setBook(bookList.getSize(),newBook);
        bookList.setSize(bookList.getSize() + 1);
    }
}
