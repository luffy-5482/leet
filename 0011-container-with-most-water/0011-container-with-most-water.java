class Solution {
    public int maxArea(int[] height) {
        int answer = 0;
        int first = 0;
        int last = height.length-1;
        while (first<last){
            int area =(last-first)*Math.min(height[last],height[first]);
            if(answer<area){
                answer=area;
            }

            if(height[first]<height[last])
                first++;
            else
            last--;
        }
        return answer;
    }
}