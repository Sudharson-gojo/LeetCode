class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    ArrayList<Integer> li =  new ArrayList<>(); 
     if (s.length() < p.length()) {
    return li;
}
   int[] freq = new int[26];
        int[] freq1 =  new int[26];
        int left =0;
        
        for(char c : p.toCharArray()){
             freq[c-'a']++;
        }
        int right =  p.length()-1;
        for(int i =0;i<=right;i++){
         freq1[s.charAt(i) - 'a']++;
        }
  
            while(right<s.length()){
                
                boolean same = true;
                for(int i =0;i< 26;  i++){
                    if(freq[i] != freq1[i]){
                        same = false;
                        break;
                    }
                }
            
            if(same){
                li.add(left);
            }
         freq1[s.charAt(left)-'a']--;
left++;
right++;

if(right < s.length()){
    freq1[s.charAt(right)-'a']++;
}
        }
        return li;
    }
}