class Solution {
    // public int maxArea(int[] height) {
    //     int answer = 0;
    //     int first = 0;
    //     int last = height.length-1;
    //     while (first<last){
    //         int area =(last-first)*Math.min(height[last],height[first]);
    //         answer=Math.max(area,answer);

    //         if(height[first]<height[last])
    //             first++;
    //         else
    //         last--;
    //     }
    //     return answer;
    // }
    public int maxArea(int[] height) {

    int left = 0;
    int right = height.length - 1;
    int maxArea = 0;

    while (left < right) {

      int area =
          Math.min(height[left], height[right])
          * (right - left);

      maxArea = Math.max(area, maxArea);

      if (height[left] < height[right])
        left++;
      else
        right--;
    }

    return maxArea;
  }
}