package InflearnLecture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,8,10,21,4,15};
        int target=24;

        List<Integer> result = mySolve(nums, target);
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }

    public static int[] solve(int[] nums,int target){

        // 담을 그릇
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int mapValue = map.get(nums[i]);
                result[0] = mapValue+1;
                result[1] = i+1;
            }else{
                map.put(target-nums[i],i);
            }
        }
        return nums;
    }

    public static List<Integer> mySolve(int[] nums,int target){

        List<Integer> result = new ArrayList<>();
        int i=0;

        while(target>0 && i<nums.length){
                target=target-nums[i];
                if(target<0) {
                    target+=nums[i++];
                }
                else {
                    result.add(i+1);
                    i++;
                }
        }
        return result;
    }
}
