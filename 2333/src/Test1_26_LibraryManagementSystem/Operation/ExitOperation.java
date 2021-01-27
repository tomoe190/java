package Test1_26_LibraryManagementSystem.Operation;

import Test1_26_LibraryManagementSystem.BookList;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("退出系统 。");
        System.exit(0);
        // c参数 0 表示进程的退出码。
        // 约定俗称，进程正常执行完毕，就返回一个退出码
        // 如果进程异常终止，就返回一个非0的退出码
        // 使用不同的退出码来表示 不同的出错原因
    }
}
