package inflearnLecture.stack_queue;

/*
Tree Node 를 Level 별로 출력하라
ex)
       3
      2  1
     5 6 7 8
=> [[3],[2,1],[5,6,7,8]]

대표적인 Queue BFS 문제. 이 문제가 모든 BFS 문제의 어머니.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
    }
}
public class LevelOrderOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(solution(root));
    }

    private static List<List<Integer>> solution(TreeNode tree) {
        List<List<Integer>> result = new ArrayList<>();
        if(tree==null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(tree);

        while(!queue.isEmpty()){
            List<Integer> list = new LinkedList<>();
            int size = queue.size();
            for(int i=0;i< size;i++){ // queue.size 를 받아놓고 할 때랑, queue.size()로 돌릴 때랑 결과가 다르다 poll 을 하는 순간 queue 의 size 가 변하기 때문에.
                TreeNode pollNode = queue.poll();
                list.add(pollNode.val);
                if(pollNode.left!=null){
                    queue.offer(pollNode.left);
                }
                if(pollNode.right!=null){
                    queue.offer(pollNode.right);
                }
            }
            result.add(list);
        }
        return result;

    }
}


