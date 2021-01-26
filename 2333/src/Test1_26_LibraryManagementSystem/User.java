package Test1_26_LibraryManagementSystem;

import Test1_26_LibraryManagementSystem.Operation.IOperation;

// User 类不应该被实例化，因为角色就只有 Admin 和NormalUser
// 所以 创建成抽象类，加 abstract如果实例化了就会报错
abstract public class User {
    protected String name;
    // 管理员支持的操作，接口不能实例化，看起来是一个数组，但数组中放置的内容
    // 是 实现了该接口的类的实例。
    // 数组只能放相同类型的数据，有了接口才能把那些操作类放在一起
    protected IOperation[] operations;

    // 这个方法用来打印该用户的菜单
    // 不同的用户支持的操作不一样，菜单的内容也不一样
    // 此处就做成抽象方法，再由该类的子类来进一步的重写这样的方法
    public abstract int menu();

    public void doOperation(int choice,BookList bookList){
        this.operations[choice - 1].work(bookList);
    }
}
