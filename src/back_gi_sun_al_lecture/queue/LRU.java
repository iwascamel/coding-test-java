package back_gi_sun_al_lecture.queue;

import java.util.Deque;
import java.util.LinkedList;

public class LRU {

    private Deque<Integer> cache;
    private int cacheSize;

    LRU(int cacheSize){
        this.cacheSize=cacheSize;
        this.cache = new LinkedList<>();
    }
    public static void main(String[] args) {
        LRU lru = new LRU(3);
        lru.query(9);
        lru.query(8);
        lru.query(1);
        lru.query(7);
        lru.query(8);

        lru.print();
    }

    // remove 연산때문에 O(n)이 소모 -> O(1)으로 풀어봐라
    void query(int number){
        if(!cache.contains(number)){
            if(cache.size() == this.cacheSize){
                cache.removeLast();
            }
            cache.addFirst(number);
        }else{
            cache.remove(number);
            cache.addFirst(number);
        }
    }

    void print(){
        System.out.println(cache);
    }
}
