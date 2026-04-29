class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int largest;
        int ans=0;
        int i=0;
        int j=n-1;
        while (i<j)
        {
            largest=Math.min(heights[i],heights[j])*(j-i);
            if(heights[i]<heights[j])
            {
                i++;
            }
            else{
                j--;
            }
            if(largest>ans)
            {

                ans=largest;
            }
        }
        return ans;
        
    }
}
