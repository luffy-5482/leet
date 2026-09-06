class Solution {
    public int maxArea(int[] height) {
        int answer = 0;
        int first = 0;
        int last = height.length-1;
        while (first<last){
            int area =(last-first)*Math.min(height[last],height[first]);
            answer=Math.max(area,answer);

            if(height[first]<height[last])
                first++;
            else
            last--;
        }
        return answer;
    }
}