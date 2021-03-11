package engineer_korea_lecture.graph;

public class ArrayToBinaryTree {
    public static void main(String[] args) {
        int[] a= new int[10];
        for(int i=0;i<10;i++){
            a[i]=i;
        }

        Tree t = new Tree();
        t.makeTree(a);
        t.searchBTree(t.root,2);
    }
    static class Tree{
        class Node{
            int data;
            Node left;
            Node right;

            Node(int data){
                this.data=data;
            }
        }
        Node root;
        void makeTree(int[] a){
            root = makeTreeR(a,0,a.length-1);
        }

        private Node makeTreeR(int[] a, int start, int end) {
            if(start>end) return null;
            int mid = (start+end)/2;
            Node node = new Node(a[mid]);

            // 여기 재귀부분이 핵심
            node.left=makeTreeR(a,start,mid-1);
            node.right=makeTreeR(a,mid+1,end);
            return node;
        }
        void searchBTree(Node n,int find){
            if(find<n.data){
                System.out.println("data is smaller than " + n.data);
                searchBTree(n.left,find);
            }else if(find>n.data){
                System.out.println("data is bigger than " + n.data);
                searchBTree(n.right,find);
            }else{
                System.out.println("data found");
            }
        }
    }
}
