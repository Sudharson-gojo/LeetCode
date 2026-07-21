class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        HashSet<Integer> sb = new HashSet<>();

        for (int num : nums) {
            sb.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>(sb);

        Collections.sort(list);

        int max = 1;
        int k = 1;

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) == list.get(i - 1) + 1) {
                k++;
                max = Math.max(max, k);
            } else {
                k = 1;
            }
        }

        return max;
    }
}