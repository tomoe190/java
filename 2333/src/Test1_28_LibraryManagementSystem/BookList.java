package Test1_28_LibraryManagementSystem;

public class BookList {
    Book books[] = new Book[100];
    int size = 0;

    public BookList() {
        books[0] = new Book("西游记","吴承恩",50.0,"古典名著");
        books[1] = new Book("水浒传","施耐庵",50.0,"古典名著");
        books[2] = new Book("三国演义","罗贯中",50.0,"古典名著");
        books[3] = new Book("红楼梦","曹雪芹",50.0,"古典名著");
        size = 4;
    }

    public Book getBook(int index) {
        return books[index];
    }

    public void setBook(int index,Book book) {
        books[index] = book;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
