class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[] = new int[2];
        a[0] = lower(nums, target);
        a[1] = upper(nums, target);
        return a;
    }
    public int lower(int a[], int x){
        int s = 0;
        int e = a.length-1;
        int ans = -1;
        while(s <= e){
            int m = s + (e - s)/2;
            if(a[m] == x){
                ans = m;
                e = m-1;
            }
            else if(a[m] > x){
                e = m - 1;
            }
            else{
                s = m + 1;
            }
        }
        return ans;
    }
    public int upper(int a[], int x){
        int s = 0;
        int e = a.length-1;
        int ans = -1;
        while(s <= e){
            int m = s + (e - s)/2;
            if(a[m] == x){
                ans = m;
                s = m + 1;
            }
            else if(a[m] > x){
                e = m - 1;
            }
            else{
                s = m + 1;
            }
        }
        return ans;
    }
}
