class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      int   n=nums.length;
        int [] arr;
       int res[];
       HashMap<Integer,Integer> map=new HashMap<>();
       int count=0;
       for(int i=0;i<n;i++)
       {
           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
       }
         List<Integer>[] list =new ArrayList[n+1];

                for(int i=0;i<=n;i++)
                {
                    list[i]=new ArrayList<>();
                }

                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();

            list[freq].add(key);
        }

                
                int result[]=new int[k];
                int index=0;

                for(int i=list.length-1;i>=0;i--)
                {
                    for(int num:list[i])
                    {
                         if(index==k)
                        {
                            break;
                        }
                        result[index++]=num;
                       
                    }     

                }
                return result;
    }
}
