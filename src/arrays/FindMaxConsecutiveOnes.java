package arrays;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int p=0;
        int max=0;
        while(p<nums.length){
            if(nums[p]==1){
                int p_start = p;
                while(nums[p]==1){
                    p++;
                }
                if(p-p_start>max){
                    max = p-p_start;
                }
            }
            else{
                p++;
            }
        }
        return max;
    }

    public void main(String[] args){

    }

}
