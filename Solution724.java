public class Solution724 {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int leftsum=0;
        int i;
        for(int x: nums)sum=sum+x;
        for( i=0;i<nums.length;i++){
            
            if(leftsum==(sum-leftsum-nums[i])){
                
                return i;
            }
            leftsum=leftsum+nums[i];
        }
        return -1;
    }
}
