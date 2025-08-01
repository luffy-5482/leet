class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result=0;
        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right)
            {
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target)
                return sum;
                if(sum<target)
                left++;
                else
                right--;
                int diff=Math.abs(sum-target);
                if(diff<min){
                    result=sum;
                    min=diff;
                }
            }
        }
        return result;
    }
}