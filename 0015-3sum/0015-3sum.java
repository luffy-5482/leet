import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            // 1. SKIP DUPLICATES FOR 'i': 
            // If this number is the same as the previous one, skip it.
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int j = i + 1;
            int k = nums.length - 1;
            
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                if (sum == 0) {
                    answer.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    
                    // 2. SKIP DUPLICATES FOR 'j':
                    // Move pointer 'j' past any identical numbers
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    
                    // 3. SKIP DUPLICATES FOR 'k':
                    // Move pointer 'k' past any identical numbers
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                    
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return answer;
    }
}
