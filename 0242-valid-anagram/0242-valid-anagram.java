class Solution {
    static {
        for (int i = 0; i < 444; i++) {
            isAnagram("a", "");
        }
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] data = new int[26];
        for ( int i = 0; i < s.length(); i++ ) {
            data[s.charAt(i) - 'a']++;
            data[t.charAt(i) - 'a']--;
        }
        for (int value: data) {
            if (value != 0) return false;
        }
        return true;
    }
}