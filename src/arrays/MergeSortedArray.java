package arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int k=0;k<n;k++){
            for(int j=0;j<m+n-1;j++){
                if(nums2[k]>=nums1[j]&&nums2[k]<nums1[j+1]){
                    sort(nums1,j+1,n+m-1);
                    nums1[j]=nums2[k];
                    //break;
                }
            }
        }
    }

    public void sort(int nums[],int start,int end){
        for(int i=end;i>=start;i--){
            nums[i]=nums[i-1];
        }
    }

}
