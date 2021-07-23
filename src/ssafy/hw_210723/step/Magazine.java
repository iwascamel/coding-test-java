package ssafy.hw_210723.step;

public class Magazine extends Book{
    private int year;
    private int month;

    public Magazine(){
        super();
    }

    public Magazine(String isbn, String title, String author, String publisher, int price, String desc) {
        this(isbn, title, author, publisher, price, desc,1,1);
    }

    public Magazine(String isbn, String title, String author, String publisher, int price, String desc, int year, int month) {
        super(isbn, title, author, publisher, price, desc);
        this.year = year;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                ", year=" + year +
                ", month=" + month +
                '}';
    }
}
