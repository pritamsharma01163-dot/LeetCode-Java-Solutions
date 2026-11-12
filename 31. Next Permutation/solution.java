class Solution {
    public void nextPermutation(int[] nums) {
        int n= nums.length;

        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                for(int j=n-1;j>i;j--){
                if(nums[j]>nums[i]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    break;
                }
            }
            reverse(nums,i+1,n-1);
            return;
            }
        }

           reverse(nums,0,n-1);
            

        }
    private void reverse(int[] nums,int left,int right){
        while(left<right){
            int t= nums[left];
            nums[left]=nums[right];
            nums[right]=t;
            left++;
            right--;
        }
    }
    }
