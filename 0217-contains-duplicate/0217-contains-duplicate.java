class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> answer = new HashMap<>();
        for(int i=0 ; i<nums.length ;i++){
            if(answer.containsKey(nums[i])){
                return true;
            }else{
                answer.put(nums[i],i);
            }
        }
        return false;

    }
}