package InflearnLecture;

/*
문제의 포인트
1. 첫 loop 에서 i 와 index 다른 두 변수가 필요하다는 것
2. 0이 시작되는 index 를 찾기
 */

// 2번 강좌
public class MovesZero {
    public static void main(String[] args) {
        int[] nums = {0,3,2,0,8,5};
        int index = 0;

        for(int i=0;i< nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }

        while(index<nums.length){
            nums[index]=0;
            index++;
        }

        for (int num : nums) {
            System.out.println("num = " + num);
        }

    }
}
