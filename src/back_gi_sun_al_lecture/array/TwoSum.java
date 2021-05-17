package back_gi_sun_al_lecture.array;


import java.util.Arrays;
import java.util.HashMap;

// arr 안에 있는 두 수를 더해서 target 을 만들 수 있는 index 를 return 하라
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,10};
        int target = 12;

        System.out.println(Arrays.toString(usingHashmap(arr,target)));
    }

    // 브루트 포스로 o(n2) 구할 수는 있지만, o(n2)은 대체적으로 답이 아니라고 생각하면 됨
    // 시간 O(n), 공간 O(n)
    public static int[] usingHashmap(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }
        for (int i=0;i<arr.length;i++){
            int findValue = target - arr[i];
            if(map.containsKey(findValue) && map.get(findValue)!=arr[i]){
                return new int[] {i,map.get(findValue)};
            }
        }
        return null;
    }
}
