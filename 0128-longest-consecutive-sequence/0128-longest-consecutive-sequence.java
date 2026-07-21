class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> sb =  new HashMap<>();
        if(nums.length==0)return 0;
        for(int num : nums){
            sb.put(num, sb.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> key =  new ArrayList<>(sb.keySet());
        key.sort((a,b)->a-b);
        int max = 1;
        int k =1;

        for(int i =1;i<key.size();i++){
            if((key.get(i)-1) == key.get(i-1)){
                k++;
                max = Math.max(max,k);
            }else{
                k=1;
            }
        }
        return max;
    }
}