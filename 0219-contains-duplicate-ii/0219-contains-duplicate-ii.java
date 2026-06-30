class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int l = nums.length;
        for(int i  =0;i<l;i++){
            if(mp.containsKey(nums[i])){
                int prev =  mp.get(nums[i]);
                int res  = Math.abs(i  - prev);

                if(res<= k){
                    return true;
                }
            }
            mp.put(nums[i],i);
        }
        return false;
    }
}