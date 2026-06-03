class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int area = 0;
        int max = 0;
        while(i<=j) {
            area = (j-i)*(Math.min(height[i],height[j]));
            max = Math.max(max , area);
            if(height[i]>height[j]) {
                j--;
            }
            else i++;
            
            
        }
        return max;
      
    }
}