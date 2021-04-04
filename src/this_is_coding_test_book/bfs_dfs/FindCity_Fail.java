package this_is_coding_test_book.bfs_dfs;

import java.util.*;

public class FindCity_Fail {

    static List<Integer> result = new ArrayList<>();
    static int[] d = new int[33001];
    static class Node{
        int val;
        List<Node> links;

        Node(int val){
            this.val=val;
            this.links = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        // 도시 N 도로 M 거리 K 출발도시 X
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();

        List<Node> nodeList = new ArrayList<>();

        for(int i=0;i<N;i++){
            nodeList.add(new Node(i+1));
            d[i]=-1;
        }

        for(int i=0;i<M;i++){
            int i1 = sc.nextInt();
            int i2 = sc.nextInt();
            nodeList.get(i1-1).links.add(new Node(i2));
        }

        solution(nodeList,K,X);

        for(int i=0;i<=N;i++){
                System.out.println(d[i]);
        }
    }

    // K 거리 X 출발도시
    private static void solution(List<Node> nodeList, int K, int X) {
        Queue<Node> q = new LinkedList<>();
        q.add(nodeList.get(X-1));

        d[X]=0;

        while(!q.isEmpty()){
            Node node = q.poll();
            int current = d[node.val];
            int size = node.links.size();

            for(int j=0;j<size;j++){
                Node node1 = node.links.get(j);
                q.add(node1);
                if(d[node1.val]==-1){
                    d[node1.val] = current+1;
                }
            }
        }
    }

}
