class Solution {
    public int compress(char[] chars) {
       int n=chars.length;
       int write=0;//kahan likhna hai
              int read=0;// kahan padna hai 
       while(read<n){
        char current=chars[read];
        int count=0;
        while(read<n && chars[read] == current){
            read++;
            count++;
        }
        chars[write++]=current;//character likjho
        if(count>1){
            for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
        }

       }
       return write;
    }
}