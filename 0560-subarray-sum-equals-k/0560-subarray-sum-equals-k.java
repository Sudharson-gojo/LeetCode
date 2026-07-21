class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> sb = new HashMap<>();
        sb.put(0,1);
        int count =0;
        int sum = 0;

        for(int num: nums){
            sum+=num;
            if(sb.containsKey(sum-k))
            {
                count+= sb.get(sum-k);
            }
            sb.put(sum,sb.getOrDefault(sum,0)+1);
        }
        return count ;
    }
}