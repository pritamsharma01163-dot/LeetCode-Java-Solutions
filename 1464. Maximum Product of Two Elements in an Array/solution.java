class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        int p1=nums[n-2];
        int p2=nums[n-1];
        int p=(p1-1)*(p2-1);
        return p;
    }
}