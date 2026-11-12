class Solution {
    public int maxProduct(int[] nums) {
       int mp=Integer.MIN_VALUE;
       int pdt=1;
       int pdt2=1;
       int n=nums.length;
       for(int i=0;i<n;i++) {
       
        if(pdt==0){
            pdt=1;
        }
        if(pdt2==0){
            pdt2=1;
        }
         pdt=pdt*nums[i];
         pdt2=pdt2*nums[n-1-i];
        mp=Math.max(mp,Math.max(pdt,pdt2));
       }
       return mp;
    }
}