class Solution {
    public int romanToInt(String s) {
        char[] roman = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] nums = {1, 5, 10, 50, 100, 500, 1000};
        
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i), roman, nums);
            int next = 0;
            if (i + 1 < s.length()) {
                next = getValue(s.charAt(i + 1), roman, nums);
            }
            
            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }
    
    private int getValue(char c, char[] roman, int[] nums) {
        for (int i = 0; i < roman.length; i++) {
            if (roman[i] == c) {
                return nums[i];
            }
        }
        return 0; // fallback, though for valid Roman numerals this shouldn't happen
    }
}
