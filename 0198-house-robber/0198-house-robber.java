class Solution {
    public int rob(int[] nums) {
       int n =  nums.length;
       int[] a  = new int[n+1];
       Arrays.fill(a,-1);
       return Math.max(robs(nums,a,n-1), robs(nums,a,n-2));
    }
    public int robs(int[] nums, int[] a, int i ){
        if(i<0)return 0;
        if(a[i]!= -1)return a[i];
         return   a[i] = nums[i] + Math.max(robs(nums,a,i-2), robs(nums,a,i-3));
    }
}