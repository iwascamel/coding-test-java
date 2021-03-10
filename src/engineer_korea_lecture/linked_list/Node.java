package engineer_korea_lecture.linked_list;

public class Node {
    int val;
    Node next;

    Node(int val){
        this.val=val;
    }
    Node(){
        super();
    }

    void linking(Node n){
        Node current = this;
        current.next=n;
    }

    void append(int k){
        Node end = new Node(k);
        Node n = this;
        while(n.next!=null){
            n=n.next;
        }
        n.next=end;
    }
    Node addNext(int k){
        Node end = new Node(k);
        Node n = this;
        while(n.next!=null){
            n=n.next;
        }
        n.next=end;
        return n.next;
    }
    void delete(int k){
        Node n = this;
        while(n.next!=null){
            if(n.next.val==k){
                n.next=n.next.next;
            }else{
                n=n.next;
            }
        }
    }
    void retrieve(){
        Node n = this;
        while(n.next!=null){
            System.out.println(n.val);
            n=n.next;
        }
        System.out.println(n.val);
    }
    Node find(int k){
        Node n = this;
        while(n.next!=null){
            if(n.val==k){
                return n;
            }
            n=n.next;
        }
        return null;
    }
    Node get(int index){
        Node n = this;
        for(int i=1;i<index;i++){
            n=n.next;
        }
        return n;
    }
    int getLength(){
        Node n = this;
        int count=1;
        while(n.next!=null){
            count++;
            n=n.next;
        }
        return count;
    }
}
