package engineer_korea_lecture.graph;

import java.util.LinkedList;

public class Graph {
    class Node{
        int data;
        boolean marked;
        LinkedList<Node> links;

        Node(int data){
            this.data=data;
            this.marked=false;
            links = new LinkedList<>();
        }
    }
    Node[] nodes;

    Graph(int size){
        nodes = new Node[size];
        for(int i=0;i<size;i++){
            nodes[i]=new Node(i);
        }
    }

    void addEdge(int i1,int i2){
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];

        if(!n1.links.contains(n2)){
            n1.links.add(n2);
        }
        if(!n2.links.contains(n1)){
            n2.links.add(n1);
        }
    }
}
