class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // Max sum is nums.length
        int[] count = new int[nums.length + 1];
        count[0] = 1; // Base case: prefix sum of 0 appears once initially
        
        int currentSum = 0;
        int total = 0;

        for (int num : nums) {
            currentSum += num;
            if (currentSum >= goal) {
                total += count[currentSum - goal];
            }
            count[currentSum]++;
        }

        return total;
    }
}