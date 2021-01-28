package Test1_28_LibraryManagementSystem.IOperation;

import Test1_28_LibraryManagementSystem.BookList;

public class ExitOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统 >> ");
        System.exit(0);
    }
}
