class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        swap(0,nums.length-1,nums);
        swap(0,k-1,nums);
        swap(k,nums.length-1,nums);
    }
    public int[] swap(int s, int e,int[] nums){
            while(s<e){
                int temp = nums[s];
                nums[s++] = nums[e];
                nums[e--]=temp;
            }
            return nums;
    }
}