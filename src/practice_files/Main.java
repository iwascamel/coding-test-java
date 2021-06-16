package practice_files;

public class Main {
    public static void main(String[] args) {
        QueueImpl q = new QueueImpl();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);

        System.out.println(q.poll());

        System.out.println(q);
    }
    static class QueueImpl{

        Node first;
        Node last;

        static class Node{
            int val;
            Node next;
            Node(int val){
                this.val=val;
            }
        }

        void offer(int val){
            Node node = new Node(val);
            if(last!=null){
                last.next=node;
            }
            last=node;
            if(first==null){
                first=last;
            }
        }
        int poll(){
            if(first==null){
                return -999;
            }
            int firstValue = first.val;
            first = first.next;
            if(first==null){
                last=null;
            }
            return firstValue;
        }
        int peek(){
            return first.val;
        }
        boolean isEmpty(){
            return first==null;
        }
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            Node node = first;
            while(node!=null){
                sb.append(node.val);
                if(node.next!=null){
                    sb.append(",");
                }
                node=node.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
