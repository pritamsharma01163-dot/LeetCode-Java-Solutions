class Solution {
    public String capitalizeTitle(String title) {
     String [] words=title.split(" ");
     StringBuilder sb = new StringBuilder();
     for(int i=0;i<words.length;i++){
        String w=words[i].toLowerCase();
        if(w.length()>2){
            w=Character.toUpperCase(w.charAt(0))+w.substring(1);
                    }
                    sb.append(w);
                    if(i<words.length-1){
                        sb.append(" ");

                    }
     }
     return sb.toString();
    }
}