class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int s = 0; 
        int e = nums.length-1;
        while(s <= e){
            int m = s + (e -s)/2;
            if(nums[s] <= nums[m]){
                min = Math.min(min, nums[s]);
                s = m + 1;
            } else{
                min = Math.min(min, nums[m]);
                e = m - 1;
            }
        }
        return min;
    }
}
