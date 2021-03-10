package inflearn_lecture.string_array;

/*
배열의 연속적인 구간에서, 최대의 합을 내는 구간의 값?
 */

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution(nums));
    }
    public static int solution(int nums[]){
        int newSum = nums[0];
        int max = nums[0];

        for(int i=1;i<nums.length;i++){
            newSum = Math.max(nums[i],newSum+nums[i]);
            max = Math.max(newSum,max);
        }
        return max;
    }
}
