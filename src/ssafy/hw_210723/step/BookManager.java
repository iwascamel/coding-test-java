package ssafy.hw_210723.step;

import java.util.Arrays;

public class BookManager implements IBookManager{

    private final int MAX_SIZE=100; //O$I
    private int size;
    private Book[] books=new Book[MAX_SIZE];

    @Override
    public void add(Book book) {
        if(book!=null) {
            if(size<MAX_SIZE && searchByIsbn(book.getIsbn())==null) {
                books[size++]=book;
            }
        }
    }

    @Override
    public Book searchByIsbn(String isbn) {
        if(isbn!=null) {
            for (int i = 0; i < size; i++) {
                if(books[i].getIsbn().equals(isbn)) {
                    return books[i];
                }
            }
        }
        return null;
    }
    @Override
    public Book[] getList() {
        return Arrays.copyOfRange(books, 0, size);
    }

    @Override
    public Book[] searchByTitle(String title) {
        Book[] titles=null;
        int count=0;
        for (int i = 0; i < size; i++) {
            if(books[i].getTitle().contains(title)) {
                count++;
            }
        }
        titles=new Book[count];
        int t=0;
        for (int i = 0; i < size; i++) {
            if(books[i].getTitle().contains(title)) {
                titles[t++]=books[i];
            }
        }
        return titles;
    }

    @Override
    public Book[] getBooks() {
        Book[] titles=null;
        int count=0;
        for (int i = 0; i < size; i++) {
            if(!(books[i] instanceof Magazine)) {
                count++;
            }
        }
        titles=new Book[count];
        int t=0;
        for (int i = 0; i < size; i++) {
            if(!(books[i] instanceof Magazine)) {
                titles[t++]=books[i];
            }
        }
        return titles;
    }

    @Override
    public Magazine[] getMagazine() {
        Magazine[] titles=null;
        int count=0;
        for (int i = 0; i < size; i++) {
            if(books[i] instanceof Magazine) {
                count++;
            }
        }
        titles=new Magazine[count];
        int t=0;
        for (int i = 0; i < size; i++) {
            if(books[i] instanceof Magazine) {
                titles[t++]=(Magazine)books[i];
            }
        }
        return titles;
    }

    @Override
    public int getTotalPrice() {
        int t=0;
        for (int i = 0; i < size; i++) {
            t+=books[i].getPrice();
        }
        return t;
    }

    @Override
    public double getPriceAvg() {
        if(size==0) {
            return 0;
        }else {
            //조심 정수 연산 정수는 버림 -> 1.0 시작
            return 1.0*getTotalPrice()/size;
        }
    }

    @Override
    public void remove(String isbn) {
        for (int i = 0; i < size; ++i) {
            // 삭제할 도서를 찾았다면 해당 도서 위치에 배열의 제일 마지막 도서를 복사
            if (books[i].getIsbn().equals(isbn)) {
                books[i] = books[size-1];
                books[size-1]=null;			// 삭제된 도서 위치 null 처리
                --size;						// 등록된 도서 수 감소
                break;
            }
        }
    }

}
