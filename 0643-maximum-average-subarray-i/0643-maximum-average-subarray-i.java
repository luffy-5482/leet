class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int ending = k-1;
        double answer = 0;
        int sum = 0;
        // while (ending < nums.length-1){
        //     double average = 0 ;
        //     average = (nums[starting]+nums[ending]+nums[starting+1]+nums[ending-1])/k;
        //     if(average>answer){
        //         answer=average;
        //     }
        //     starting++;
        //     ending++;
        // }
        // return answer;
        if(nums.length==1)
        return nums[0];

        for (int i=0;i<k;i++){
            sum+=nums[i];
        }
        
        answer=sum;
        for (int i=0 ; i<nums.length-k;i++){
            if(nums.length!=k){
            sum+=nums[ending+1]-nums[i];
            ending++;
            }
            if(answer<sum)
            answer=sum;
        }
        double average =answer/k;
        return average;
    }
}