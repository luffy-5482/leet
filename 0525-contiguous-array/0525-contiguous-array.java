class Solution {
    public int findMaxLength(int[] nums) {
        for (int i=0;i<nums.length ; i++)
            if(nums[i]==0)nums[i]=-1;
        
        Map<Integer,Integer> cal = new HashMap<>();
        int maxcount = 0;
        int sum = 0;

        cal.put(0,-1);

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(cal.containsKey(sum)){
                int last = cal.get(sum);
                maxcount=Math.max(maxcount,i-last);
            }else
            cal.put(sum,i);
        }
        return maxcount;


    }
}