class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> ans= new ArrayList<>();
    if(nums.length<4){
        return ans;
    }    
    int n=nums.length;
    Arrays.sort(nums);
    for(int i=0;i<n;i++){
        if(nums[i]>0&&nums[i]>target){
            return ans;
        }
        if(i>0&&nums[i]==nums[i-1]){
            continue;
        }
        for(int j=i+1;j<n;j++){
            if(j>i+1&&nums[j]==nums[j-1]){
                continue;
            }
            int left=j+1;
            int right=n-1;
            while(left<right){
                int sum=nums[i]+nums[j]+nums[left]+nums[right];
                if(sum>target){
                    right--;
                }else if(sum<target){
                    left++;
                }else{
                    ans.add(List.of(nums[i],nums[j],nums[left],nums[right]));
                    left++;
                    while(left<right&&nums[left]==nums[left-1]){
                        left++;
                    }
                    right--;
                    while(left<right&&nums[right]==nums[right+1]){
                        right--;
                    }
                }
            }
        }
    
    }
    return ans;
    }
}