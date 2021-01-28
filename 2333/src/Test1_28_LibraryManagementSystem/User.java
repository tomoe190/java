package Test1_28_LibraryManagementSystem;

import Test1_28_LibraryManagementSystem.IOperation.IOperation;

abstract public class User {
    protected String name;
    protected IOperation[] operations;
    public abstract int menu();

    public void doOperation(int choice,BookList bookList){
        this.operations[choice - 1].work(bookList);
    }

}
