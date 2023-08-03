class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int arr[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int num = nums[i];
            int rem = target - num;
            if(map.containsKey(rem)){
                arr[0] = map.get(rem);
                arr[1] = i;
            }
            map.put(num, i);
        }
        return arr;
    }
}
