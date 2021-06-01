package back_gi_sun_al_lecture.queue;

// 21.06.01
// https://dev-whoan.xyz/24
// 하다말음 이해안돼서

public class QueueImpl {
    int front;
    int rear;
    int capacity;
    int[] queue;
    QueueImpl(int capacity){
        this.front=-1;
        this.rear=-1;
        this.capacity=capacity;
        queue = new int[capacity];
    }
    public boolean isFull(){
        return (this.rear == this.capacity-1);
    }
    public boolean isEmpty(){
        if(front==rear){
            front=-1;
            rear=-1;
        }
        return false;
    }
}
