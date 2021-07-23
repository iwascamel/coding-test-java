package ssafy.hw_210723.step;

public interface IBookManager {
    void add (Book book);
    Book searchByIsbn(String isbn);
    Book[] getList();
    Book[] searchByTitle(String title);
    Book[] getBooks();
    Magazine[] getMagazine();
    int getTotalPrice();
    double getPriceAvg();
    void remove(String isbn);
}
