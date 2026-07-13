class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> sb  = new HashMap<>();
        for(int num: nums){
            sb.put(num, sb.getOrDefault(num,0)+1);

        }
        for(int num: nums){
            if(num%2 == 0){
            if(sb.get(num) == 1){
                return num;
            }
            }
        }
        return -1;
    }
}