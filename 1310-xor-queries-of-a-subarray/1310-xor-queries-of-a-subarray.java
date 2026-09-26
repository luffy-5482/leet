class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] pref = new int[n];
        
        // 1. Build the prefix XOR array
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] ^ arr[i];
        }
        
        // 2. Answer each query in O(1)
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            
            if (left == 0) {
                answer[i] = pref[right];
            } else {
                answer[i] = pref[right] ^ pref[left - 1];
            }
        }
        
        return answer;
    }
}