class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> sb  = new HashMap<>();
        for(String s : words){
            sb.put(s, sb.getOrDefault(s,0)+1);
        }
        List<String> key  = new ArrayList<>(sb.keySet());
        key.sort((a, b) -> {
            if (!sb.get(a).equals(sb.get(b))) {
                return sb.get(b) - sb.get(a);
            }
            return a.compareTo(b);
        });
       
        return key.subList(0,k);
    }
}