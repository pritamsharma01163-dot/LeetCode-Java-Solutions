class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();
        if(s.length()==t.length()){
            char[] scharArray= s.toCharArray();
             char[] tcharArray= t.toCharArray();
             Arrays.sort(tcharArray);
             Arrays.sort(scharArray);
             boolean result=Arrays.equals(tcharArray,scharArray);
             if(result){
                return true;
             }else{
                return false;
             }
        }
        return false;
    }
}