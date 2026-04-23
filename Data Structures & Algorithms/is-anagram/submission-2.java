class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        int j=0;

        HashMap<Character,Integer> map1=new HashMap<>();
                HashMap<Character,Integer> map2=new HashMap<>();

                if(s.length()!=t.length())
                {
                    return false;
                }
    
        for(int i=0;i<m;i++)
        {
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
        }
         for(int i=0;i<n;i++)
        {
            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
        }
        // if(map1.size()!=map2.size())
        // {
        //     return false;
        // }
         for( j=0;j<n;j++)
         {
if(!map2.get(s.charAt(j)).equals(map1.get(s.charAt(j))))           
 {
                break;
            }
         }
         if(j!=n)
         {
            return false;
         }
         else {
            return true;
         }
    }
}
