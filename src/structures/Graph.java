package structures;

import java.util.LinkedList;

public class Graph {

    static class G{
        Node[] nodes;
        class Node{
            int val;
            LinkedList<Node> linkedList;
            Node(int size){
                nodes = new Node[size];
                for(int i=0;i<size;i++){
                    nodes[i].val=i;
                }
            }
            void addEdge(int i1,int i2){

            }
        }
    }





    public static void main(String[] args) {

    }
}
