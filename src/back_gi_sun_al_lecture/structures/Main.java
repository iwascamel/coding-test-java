package back_gi_sun_al_lecture.structures;

public class Main {
    public static void main(String[] args) throws Exception {
        StackImplByArray stack = new StackImplByArray();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();
        stack.pop();
        stack.pop();

        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);

        StackImplByLinkedList stack2 = new StackImplByLinkedList();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);

        QueueImplByArray queue = new QueueImplByArray();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println("queue.poll() = " + queue.poll());

        System.out.println(queue);

    }
}
