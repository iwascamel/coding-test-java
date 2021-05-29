package back_gi_sun_al_lecture.structures;

public class StackImplByLinkedList {

    LinkedList list = new LinkedList();

    public void push(int data){
        list.add(data);
    }
    public int peek(){
        return list.peek();
    }
    public int pop(){
        return list.pop();
    }
    public void print(){
        list.print();
    }
}
