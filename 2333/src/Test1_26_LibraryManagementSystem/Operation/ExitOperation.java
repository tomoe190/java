package Test1_26_LibraryManagementSystem.Operation;

import Test1_26_LibraryManagementSystem.BookList;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("退出系统");
    }
}
