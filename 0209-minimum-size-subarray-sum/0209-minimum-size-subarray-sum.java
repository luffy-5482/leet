class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minWindow = Integer.MAX_VALUE;
        int sum = 0;
        int lowpointer = 0;
        int highpointer = 0;
        while(highpointer<nums.length){
            sum+=nums[highpointer];
            highpointer++;
            while(sum>=target){
                int currentwindow = highpointer-lowpointer;
                minWindow = Math.min(currentwindow,minWindow);
                sum-=nums[lowpointer];
                lowpointer++;
            }

        }
        return minWindow==Integer.MAX_VALUE ? 0 : minWindow;
    }
}