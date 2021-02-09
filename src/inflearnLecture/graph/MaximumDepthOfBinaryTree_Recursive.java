package inflearnLecture.graph;

/*
tree 의 depth 를 return 하라

recursive 는 곧 stack

recursive =
1. 이 값을 알려면 밑에 값을 알아야 함
2. 밑에서 부터 위로 쌓아서 올라가는 방식
 */

class TreeNode{
    int val;
    TreeNode left,right;

    TreeNode(int val){
        this.val=val;
    }
}

public class MaximumDepthOfBinaryTree_Recursive {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left=new TreeNode(1);
        node.right=new TreeNode(4);
        node.left.left=new TreeNode(5);
        node.left.right=new TreeNode(8);
        node.left.left.left = new TreeNode(7);
        int solution = solution(node);
        System.out.println(solution);
    }

    private static int solution(TreeNode node) {
        if (node==null) return 0;
        int left = solution(node.left);
        int right = solution(node.right);
        return Math.max(left,right)+1;
    }
}
