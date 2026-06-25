class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
                int m=nums1.length;
                int[] output=new int[m];

        ArrayList<Integer> set =new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            set.add(-1);
        }
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty()&& nums2[st.peek()]<nums2[i])
            {
                int k=st.pop();
                set.set(k, nums2[i]);
            }
            st.push(i);
        }
        for(int i=0;i<n;i++)
        {
            map.put(nums2[i], set.get(i));
        }
        for(int i=0;i<m;i++)
        {
            output[i]=map.get(nums1[i]);
        }
        return output;
    }
}