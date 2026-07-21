class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> sb =  new HashSet<>();
        int left =0;
        
        int max =0;
        int  l = s.length();
        for(int right =0; right< l;right++){
            while(sb.contains(s.charAt(right))){
                sb.remove(s.charAt(left));
                left++;
            }
            sb.add(s.charAt(right));
            max = Math.max(max,right-left+1);

        }
        return max;
    }
}