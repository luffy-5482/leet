class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> count = new HashSet<>();
        int answer = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while (count.contains(s.charAt(right))) {//so this will run until the duplicate element is removed from the set 
                count.remove(s.charAt(left));
                left++;
            }

            count.add(s.charAt(right));
            answer = Math.max(answer, right - left + 1);
        }
    return answer;
    }
}