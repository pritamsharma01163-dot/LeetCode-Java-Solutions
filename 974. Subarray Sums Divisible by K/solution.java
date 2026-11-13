class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        freq.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum=(sum+nums[i])%k;
            if(sum<0){
                sum+=k;
            }
            if(freq.containsKey(sum)){
               
 count += freq.get(sum);    
            }
            freq.put(sum, freq.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}