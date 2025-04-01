class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] sqr = new int[n];
        int start = 0, end = n-1;
        for(int i=n-1;i>=0;i--){
            if(Math.abs(nums[start])>Math.abs(nums[end])){
                sqr[i]=nums[start]*nums[start];
                start++;
            }
            else{
                sqr[i]=nums[end]*nums[end];
                end--;
            }
        }
        return sqr;
    }
}