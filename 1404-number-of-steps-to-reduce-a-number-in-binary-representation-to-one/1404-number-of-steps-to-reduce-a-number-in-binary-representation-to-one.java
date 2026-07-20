class Solution {
    public int numSteps(String s) {

        int steps = 0;
        int carry = 0;

        // Traverse from right to left (ignore the leftmost bit)
        for (int i = s.length() - 1; i > 0; i--) {

            int bit = s.charAt(i) - '0';

            if (bit + carry == 1) {
                // Odd number:
                // 1. Add 1 (creates carry)
                // 2. Divide by 2
                steps += 2;
                carry = 1;
            } else {
                // Even number:
                // Only divide by 2
                steps += 1;
            }
        }

        // If carry is still 1, one extra step is needed
        return steps + carry;
    }
}