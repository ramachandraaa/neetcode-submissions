class Solution {
    public void rotate(int[] nums, int k) {
       int  n=nums.length;
        ArrayList<Integer> list =new ArrayList<>();
        if(k>n)
        {
            k=k%n;
        }
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }
        int j=n-1;
        while(j>n-k-1)
        {
            list.addFirst(nums[j]);
            j--;
        }
       Integer[] arr = list.toArray(new Integer[list.size()]);
       for(int i=0;i<n;i++)
       {
        nums[i]=arr[i];
       }
    }
}