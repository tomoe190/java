package Test1_26_LibraryManagementSystem;

public class BookList {
    // 100 相当于 BookList 的最大容量
    private Book[] books = new Book[100];
    // 目前的值
    private int size = 0;

    // 构造方法能否设置成private？
    // 如果设成private 此时在类的外部就无法 new 这个实例
    // 不能
    // 除非下面两种情况：
    // 1、有多个构造方法，这个private构造方法就是为了给别的方法调用的
    // 2、(单例模式)这个构造方法在当前类的某个 static 方法中调用，由这个static返回该实例的引用
    public BookList(){
        books[0] = new Book("红楼梦","曹雪芹",50,"古典名著");
        books[1] = new Book("三国演义","罗贯中",50,"古典名著");
        books[2] = new Book("西游记","吴承恩",50,"古典名著");
        books[3] = new Book("水浒传","施耐庵",50,"古典名著");
        size = 4;
    }

    // 后面针对其中的某一本书进行操作
    // 虽然有些属性是private 修饰的，但不意味着外部不能用
    // 通过 public 修饰的方法来 获取/操作 这样的属性
    public Book getBook(int index){      // getter 方法
        return books[index];
    }

    public void setBook(int index,Book book){    // setter 方法
        books[index] = book;
    }
    // 既然有 getter、setter，是不是把 books 设置成 public 更好？
    // 不是
    // 还是用 getter、setter 更好，根据实际可以在这两个方法的内部对如何访问数据进行设置、限制

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



}
