package inflearn_lecture.graph;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTreeBFS {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left=new TreeNode(2);
        node.right=new TreeNode(3);
        node.left.left=new TreeNode(4);
        node.left.right=new TreeNode(5);
        node.left.left.left = new TreeNode(6);
        int solution = solution(node);
        System.out.println(solution);
    }

    private static int solution(TreeNode node) {
        if(node==null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        int count = 0;
        queue.offer(node);
        while(!queue.isEmpty()){
            int size = queue.size();
            // 현재 큐에 있는 놈을 전부 다 빼고, 그 후에(한 사이클이 돌고 난뒤) count 를 증가 시켜줌. left 와 right 값이 있으면 큐에 넣어줌
            for(int i=0;i<size;i++){
                TreeNode pollNode = queue.poll();
                if(pollNode.left!=null){
                    queue.offer(pollNode.left);
                }
                if(pollNode.right!=null){
                    queue.offer(pollNode.right);
                }
            }
            count++;
        }
        return count;
    }
}
