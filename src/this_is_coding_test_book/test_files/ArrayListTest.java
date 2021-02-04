package this_is_coding_test_book.test_files;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    public static void main(String args[]){
        ArrayList<Auction> arrayTest = new ArrayList();

        Auction test1 = new Auction(1,20000);
        Auction test2 = new Auction(2,4212);
        Auction test3 = new Auction(3,400);
        Auction test4 = new Auction(4,4500);
        Auction test5 = new Auction(5,50000);

        arrayTest.add(test1);
        arrayTest.add(test2);
        arrayTest.add(test3);
        arrayTest.add(test4);
        arrayTest.add(test5);

        Collections.sort(arrayTest);

        System.out.println(arrayTest.size());

//        for(Auction a : arrayTest){
//            System.out.println(a.getId());
//        }

    }
}
class Auction implements Comparable<Auction> {
    int id;
    int money;

    public Auction(int id,int money){
        this.id = id;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public int getMoney() {
        return money;
    }


    @Override
    public int compareTo(Auction s) {
        if (this.money < s.getMoney()) {
            return -1;
        } else if (this.money > s.getMoney()) {
            return 1;
        }
        return 0;
    }
}


