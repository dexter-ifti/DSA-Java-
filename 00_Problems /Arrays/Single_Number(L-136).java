class Solution {
    // this is brute force --> my thinking 
    // public int singleNumber(int[] nums) {
    //    HashMap<Integer, Integer> map = new HashMap<>();

    //    for(int i = 0; i < nums.length; i++){
    //        map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
    //    }

    //    for(int i = 0; i < nums.length; i++){
    //        if(map.get(nums[i]) <= 1){
    //            return nums[i];
    //        }
    //    }
    //    return nums[0];
    // }
    public int singleNumber(int[] nums) {
        int ans=0; //since XOR with 0 returns same number 
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];  // ans = (ans) XOR (array element at i) 
        }
        return ans;    
    }
}
