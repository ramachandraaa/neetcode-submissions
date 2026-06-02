class Solution {
    public int maxProfit(int[] arr) {
       int n= arr.length;
       int i=0;
       int sum=0;
       if(n==1)
       {
        return 0;
       }
       ArrayList<Integer> list=new ArrayList<>();
      while(i<n-1)
      {
        if(arr[i]<arr[i+1])
        {
            list.add(arr[i+1]-arr[i]);
        }
        i++;
      }
      for( i=0;i<list.size();i++)
      {
            sum=sum+list.get(i);
      }
      return sum;
    }
}