class Solution {
    public int longestConsecutive(int[] nums) {
        int count =1;
        int largest=0;

            HashSet<Integer> set= new HashSet<>();
            for(int i=0;i<nums.length;i++)
            {
                set.add(nums[i]);
            }
            if(set.isEmpty())
            {
                return 0;
            }
            if(set.size()==1)
            {
                return 1;
            }
            for(int val:set)
            {
                if(!set.contains(val-1))
                {
                    int k=val;
                    while(set.contains(k+1))
                    {
                        k++;
                        count++;
                    }
                    if(count>largest)
                    {
                        largest=count;
                    }
                    count=1;
                }

            }
            return largest;
}
}