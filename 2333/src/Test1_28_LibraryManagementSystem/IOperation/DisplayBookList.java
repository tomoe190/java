package Test1_28_LibraryManagementSystem.IOperation;

import Test1_28_LibraryManagementSystem.BookList;

public class DisplayBookList implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("展示书籍列表 >> ");
        for (int i = 0; i < bookList.getSize(); i++) {
            System.out.println(bookList.getBook(i));
        }
    }
}
