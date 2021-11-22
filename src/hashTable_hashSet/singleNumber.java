package hashTable_hashSet;

import java.util.HashSet;

public class singleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                hs2.add(nums[i]);
            }else{
                hs.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(!hs2.contains(nums[i])) return nums[i];
        }
        return -1;
    }
}
