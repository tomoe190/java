package Test1_26_LibraryManagementSystem;

public class Book {
    private String name;
    private String author;
    private double price;
    private String type;
    // 默认是false ，但是显示的写出来可读性更好
    private boolean isBorrowed = false;

    // 每本书的名字价格。。。都不同
    // 使用构造方法，构造的时候以传入参数的形式，确定具体的值
    // 构造实例时，显示的创建相关参数，来传入相关信息，书名。。。
    public Book(String name, String author, double price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }

    public String getName() {
        return name;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
