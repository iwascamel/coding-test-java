package practice_files;

import java.util.LinkedList;
import java.util.Stack;

class Graph{
    static class Node{
        int data;
        LinkedList<Node> linkedList;
        boolean marked;
        Node(int data){
            this.data=data;
            this.marked=false;
            this.linkedList=new LinkedList<>();
        }
    }
    Node[] nodes;
    Graph(int size){
        nodes = new Node[size];
        for(int i=0;i<size;i++){
            nodes[i] = new Node(i);
        }
    }
    void addEdge(int i1,int i2){
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];
        if(!n1.linkedList.contains(n2)){
            n1.linkedList.add(n2);
        }
        if(!n2.linkedList.contains(n1)){
            n2.linkedList.add(n1);
        }
    }
    void dfs(){
        dfs(0);
    }
    void dfs(int index){
        Node root = nodes[index];
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        root.marked=true;
        while(!stack.isEmpty()){
            Node r= stack.pop();
            for (Node node : r.linkedList) {
                if(node.marked==false){
                    node.marked=true;
                    stack.push(node);
                }
            }
            visit(r);
        }
    }
    void visit(Node n){
        System.out.println(n);
    }
}

public class DfsBfsPractice {
    public static void main(String[] args) {

    }
}
