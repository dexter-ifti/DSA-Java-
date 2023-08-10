class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> listP = new ArrayList<>();  
        ArrayList<Integer> listN = new ArrayList<>();

        for(int i : nums){
            if(i > 0){
                listP.add(i);
            } else{
                listN.add(i);
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                nums[i] = listP.get(i/2);
            }else{
                nums[i] = listN.get(i/2);
            }
        }
        return nums;
    }
}
