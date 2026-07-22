class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0 ;
        int n =  nums.length;
        int c=0;
        int max=0;
        for(int right =0;right< n;right++){
            if(nums[right] == 1){
                c++;
            }
            while((right - left+1) - c>k){
                if(nums[left] == 1){
                    c--;
                }
                left++;
                
            }
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}