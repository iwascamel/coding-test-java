package engineer_korea_lecture.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS_DFS {
    public static void main(String[] args) {
        Graph g = new Graph(9);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(3,5);

        g.dfs();

    }
    static class Graph{
        class Node{
            int data;
            LinkedList<Node> links;
            boolean marked;
            Node (int data){
                this.data=data;
                this.marked =false;
                links =new LinkedList<>();
            }
        }
        Node[] nodes;
        Graph(int size){
            nodes=new Node[size];
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
        // 0번부터 들어간다고 가정
        void dfs(){
            dfs(0);
        }
        void dfs(int index){
            Node root = nodes[index];
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            root.marked =true;
            while(!stack.isEmpty()){
                Node r = stack.pop();
                for(Node n : r.links){
                    if(n.marked ==false){
                        n.marked=true;
                        stack.push(n);
                    }
                }
                visit(r);
            }
        }
        void bfs(){
            bfs(0);
        }
        void bfs(int index){
            Node root = nodes[index];
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            root.marked=true;
            while(!queue.isEmpty()){
                Node r = queue.poll();
                for(Node n:r.links){
                    if(n.marked==false){
                        n.marked=true;
                        queue.offer(n);
                    }
                }
                visit(r);
            }
        }

        // dfs 재귀함수 이용 구현
        void dfsR(Node r){
            if(r==null) return;
            r.marked=true;
            visit(r);
            for(Node n : r.links){
                if(n.marked==false){
                    dfsR(n);
                }
            }
        }
        void dfsR(int index){
            Node r = nodes[index];
            dfsR(r);
        }
        void dfsR(){
            dfsR(0);
        }


        private void visit(Node r) {
            System.out.println(r.data);
        }
    }

}

