class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int n=s.length();
        int max=0;
        HashSet<Character> set =new HashSet<Character>();
       for(int j=0;j<n;j++)
       {
        char current= s.charAt(j);
        while( set.contains(current))
        {
            set.remove(s.charAt(i));
            i++;

        }
        set.add(current);
        max=Math.max(max,j-i+1);

       }
        return max;
    }
}
