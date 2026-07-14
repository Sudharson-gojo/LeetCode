class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> sb  = new HashMap<>();
        for(String s: strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key =  new String(ch);
            if(! sb.containsKey(key)){
                sb.put(key,new ArrayList<>());
            }
            sb.get(key).add(s);
        }
        return new ArrayList<>(sb.values());
    }
}