package arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            for(int j=i+m-1;j>0;j--){
                if(nums1[j]>nums2[i]){
                    nums1[j+1]=nums1[j];
                }
                else{
                    nums1[j+1]=nums2[i];
                    break;
                }
            }
        }
    }
}
