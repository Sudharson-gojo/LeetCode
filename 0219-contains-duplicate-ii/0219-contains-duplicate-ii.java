class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> sb  = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(sb.containsKey(nums[i])){
                int prev  = sb.get(nums[i]);
                int res = Math.abs(prev-i);
                if(res<=k){
                    return true;
                }
            }
            sb.put(nums[i],i);
        }
        return false;
    }
}