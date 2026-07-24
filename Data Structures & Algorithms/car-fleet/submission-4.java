class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double arr[]=new double[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=(double)(target -position[i])/speed[i];
        }  
     int npos[] = position.clone();
     Arrays.sort(npos);        
HashMap<Integer,Double> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(position[i], arr[i]);
        }
        double last[]=new double[n];
        for(int i=0;i<n;i++)
        {
            last[i]=map.get(npos[i]);
        }
   double maxTime = 0;
int fleets = 0;

for (int i = n - 1; i >= 0; i--) {
    if (last[i] > maxTime) {
        fleets++;
        maxTime = last[i];
    }
}
    return fleets;
    }
}
