class Solution {
    public int[] findErrorNums(int[] nums) {
       int n =nums.length;
       int[] count=new int[n+1];
       for(int x: nums){
        count[x]++;
       }
       int repeat=0,missing=0;
       for(int i=1;i<=n;i++){
        if(count[i]==2){
            repeat=i;

        }
        if(count[i]==0){
            missing=i;

        }
       }
       return new int[]{repeat,missing};
    }
}