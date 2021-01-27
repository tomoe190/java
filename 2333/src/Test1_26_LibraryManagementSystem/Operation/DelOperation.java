package Test1_26_LibraryManagementSystem.Operation;

import Test1_26_LibraryManagementSystem.BookList;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("删除书籍");
    }
}
