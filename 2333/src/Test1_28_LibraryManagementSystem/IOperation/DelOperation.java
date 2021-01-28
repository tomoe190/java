package Test1_28_LibraryManagementSystem.IOperation;

import Test1_28_LibraryManagementSystem.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍 >> ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除书籍的书名：");
        String name = scanner.next();
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if(name.equals(bookList.getBook(i).getName())) {
                if(i == bookList.getSize() - 1) {
                    bookList.setSize(bookList.getSize() - 1);
                    System.out.println("删除成功");
                    return;
                }
                bookList.setBook(i,bookList.getBook(bookList.getSize() - 1));
                bookList.setSize(bookList.getSize() - 1);
                System.out.println("删除成功");
                return;
            }
        }
        if (i >= bookList.getSize() - 1) {
            System.out.println("未找到《" + name + "》，删除失败");
        }
    }
}
