// BRUTE fORCE APPROACH - O(n^2)
class Solution {
    public boolean ls(int a[], int x){
        for(int i = 0; i < a.length; i++){
            if(a[i] == x){
                return true;
            }
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int longest = 1;
        for(int i = 0; i < n; i++){
            int x = nums[i];
            int cnt = 1;
            while(ls(nums, x+1)){
                x += 1;
                cnt++;
            }
            longest = Math.max(cnt, longest);
        }
        return longest;
    }
}
// Better Approach - O(n * logn)
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int longest = 1;
        int cnt = 0;
        int last_smaller = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] - 1 == last_smaller){
                cnt += 1;
                last_smaller = nums[i];
            } else if(nums[i] != last_smaller){
                cnt = 1;
                last_smaller = nums[i];    
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
}
//  OPTIMIZED APPROACH - O(n) & O(n)
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        for(int it : set){
            if(!set.contains(it-1)){
                int count = 1;
                int x = it;
                while(set.contains(x+1)){
                    x = x+1;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
