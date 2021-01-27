package Test1_26_LibraryManagementSystem.Operation;

import Test1_26_LibraryManagementSystem.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("查找书籍 >> ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找书籍的书名：");
        String name = scanner.next();
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if((bookList.getBook(i).getName()).contains(name)){
                System.out.println(bookList.getBook(i));
                System.out.println("查找成功。");
                break;
            }
        }
        if(i >= bookList.getSize() ){
            System.out.println("未找到《" + name + "》，查找失败。");
        }
    }
}
