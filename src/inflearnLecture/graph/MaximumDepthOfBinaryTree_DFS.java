package inflearnLecture.graph;

import java.util.Stack;

public class MaximumDepthOfBinaryTree_DFS {
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

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> valueStack = new Stack<>();
        int max=0;

        stack.push(node);
        valueStack.push(1);

        while(!stack.isEmpty()){
            TreeNode pop = stack.pop();
            int count = valueStack.pop();

            if(pop.left!=null){
                stack.push(pop.left);
                valueStack.push(count+1); // count ++ 와 count+1 헷갈리지 말자
            }
            if(pop.right!=null){
                stack.push(pop.right);
                valueStack.push(count+1);
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
