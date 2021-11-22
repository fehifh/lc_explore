package hashTable_hashSet;

import java.util.HashSet;
import java.util.LinkedList;

public class intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs1.add(nums1[i]);
        }
        HashSet<Integer> hs2=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            hs2.add(nums2[i]);
        }
        LinkedList<Integer> arr = new LinkedList<>();
        for(int num1:hs1){
            for(int num2:hs2){
                if(num1==num2) arr.add(num1);
            }
        }
        int[] aws = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            aws[i]=arr.get(i);
        }
        return aws;
    }
}
