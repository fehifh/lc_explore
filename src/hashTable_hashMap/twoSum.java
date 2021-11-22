package hashTable_hashMap;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args){
        int[] aws = twoSum(new int[]{6,3,2,1},5);
        System.out.println(aws[0]);
        System.out.println(aws[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int c = target-nums[i];
            if(map.containsKey(c) && map.get(c)!=i){
                return new int[]{i,map.get(c)};
            }
        }
        return null;
    }
}
