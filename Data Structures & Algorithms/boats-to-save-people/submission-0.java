class Solution {
    public int numRescueBoats(int[] people, int limit) {
       int n=people.length;
       Arrays.sort(people);
       int i=0;
       int j=n-1;
       int count=0;         
      while(j>=i)
      {
        if(people[j]+people[i]>limit)
        {
            j--;
            count++;
        }
        else{
            i++;
            j--;
            count++;
        }
      }
      return count;
    }
}