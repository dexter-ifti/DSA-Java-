class Solution {
    public int searchInsert(int[] nums, int target) {
        return search(nums, target, 0, nums.length-1);
    }
    public int search(int a[], int x, int s, int e){
        if(x > a[e]){
            return e+1;
        }
        while(s <= e){
        int m = s + (e - s)/2;
            if(a[m] == x){
                return m;
            }
            else if(a[m] > x){
                e = m - 1;
            }
            else{
                s = m + 1;
            }
        }
        return s;
    }
}
