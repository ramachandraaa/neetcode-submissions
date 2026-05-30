class Solution {
    public boolean checkInclusion(String s1, String s2) {
            int i=0;
            int j=s1.length()-1;
            int n=s2.length();
            HashSet<String> set = new HashSet<>();
            char[] chars = s1.toCharArray();
        Arrays.sort(chars);

        String sortedStr = new String(chars);
        s1=sortedStr;
            while(j<n)
            {
            String    temps= s2.substring(i,j+1);
               char[] charss = temps.toCharArray();
                       Arrays.sort(charss);
                String sortedStr1 = new String(charss);



              set.add(sortedStr1);
              i++;
              j++;
            }
            
        if(set.contains(s1))
        {
            return true ;
        }
        return false;
    }
}
