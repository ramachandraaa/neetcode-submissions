class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        int arr1[] =new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=Math.abs(x-arr[i]);
        }
        
        for(int i=0;i<k;i++)
        {
            list.add(arr[i]);
        }
       int i=0;
        while(i<n-k)
        {
            if(arr1[i]>arr1[k+i])
            {
                list.removeFirst();
                list.add(arr[k+i]);
            }
            i++;

        }
        return list;
    }
}