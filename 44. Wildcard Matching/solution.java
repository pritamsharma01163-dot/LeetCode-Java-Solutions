class Solution {
    public boolean isMatch(String s, String p) {
        int i=0,j=0;
        int star=-1;
        int match=0;
        while(i<s.length())    {
            // Characters match or pattern has '?'
            if(j<p.length()&&(p.charAt(j)=='?'||p.charAt(j)==s.charAt(i))){
                i++;
                j++;
            }
            // Pattern has '*'
            else if(j<p.length()&& p.charAt(j)=='*'){
                star=j;
                match =i;
                j++;
            }
            // Previous '*' can match more characters
            else if(star!=-1){
                j=star+1;
                match++;
                i=match;
            }
            // No possible match
            else{
                return false;
            }

        }
         // Ignore remaining '*' in pattern
         while(j<p.length()&& p.charAt(j)=='*'){
            j++;
         }
         return j==p.length();// true
        }
}

