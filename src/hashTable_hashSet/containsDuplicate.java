package hashTable_hashSet;

import java.util.HashSet;

public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0; i<nums.length;i++){
            if(hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
}
