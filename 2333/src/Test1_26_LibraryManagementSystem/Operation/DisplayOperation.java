package Test1_26_LibraryManagementSystem.Operation;

import Test1_26_LibraryManagementSystem.BookList;

public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList){
        System.out.println("查找书籍信息");
    }
}
