class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        if (s == null || words == null || words.length == 0) {
            return result;
        }

        int wordLength = words[0].length();
        int wordCount = words.length;
        int totalLength = wordLength * wordCount;

        if (s.length() < totalLength) {
            return result;
        }

        // Frequency of words we NEED
        HashMap<String, Integer> required = new HashMap<>();

        for (String word : words) {
            required.put(word, required.getOrDefault(word, 0) + 1);
        }

        // We have to try every possible offset
        for (int offset = 0; offset < wordLength; offset++) {

            int left = offset;
            int right = offset;

            int wordsInWindow = 0;

            // Frequency of words currently inside window
            HashMap<String, Integer> window = new HashMap<>();

            while (right + wordLength <= s.length()) {

                // Take the next word
                String word = s.substring(right, right + wordLength);

                right += wordLength;

                // Case 1: word is not required
                if (!required.containsKey(word)) {

                    window.clear();
                    wordsInWindow = 0;
                    left = right;

                    continue;
                }

                // Add word to current window
                window.put(
                    word,
                    window.getOrDefault(word, 0) + 1
                );

                wordsInWindow++;

                // Case 2: word appears too many times
                while (window.get(word) > required.get(word)) {

                    String leftWord = s.substring(left, left + wordLength);

                    window.put(
                        leftWord,
                        window.get(leftWord) - 1
                    );

                    left += wordLength;
                    wordsInWindow--;
                }

                // Case 3: window contains exactly all words
                if (wordsInWindow == wordCount) {

                    result.add(left);

                    // Move left forward to search for another window
                    String leftWord = s.substring(left, left + wordLength);

                    window.put(
                        leftWord,
                        window.get(leftWord) - 1
                    );

                    left += wordLength;
                    wordsInWindow--;
                }
            }
        }

        return result;
    }
}