class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int start = 0, end = len-1, ans=len;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]>=target){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
}