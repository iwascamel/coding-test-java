package engineer_korea_lecture.tree;

public class Tree {
    public Node root;

    public void setNode(Node node) {
        this.root = node;
    }

    public Node getRoot() {
        return root;
    }
    public Node makeNode(Node left,Node right,int data){
        Node node = new Node();
        node.data=data;
        node.left=left;
        node.right=right;
        return node;
    }
    public void inorder(Node node){
        if( node!=null ){
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }
}
