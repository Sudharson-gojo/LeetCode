class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> sb  = new HashSet<>();
        for(Integer num: nums){
            if(sb.contains(num)){
                return true;
            }
            sb.add(num);
        }
        return false;

    }
}