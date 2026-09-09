class Solution {
    public boolean isSubsequence(String s, String t) {
        int pointer = 0;
        int n = t.length();
        for (int i=0 ; i<n ; i++){
            if(pointer < s.length() && s.charAt(pointer) == t.charAt(i)){
            pointer++;
            }
        }
        return pointer == s.length();
    }
}