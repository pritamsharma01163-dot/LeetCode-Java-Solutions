class Solution {
    int[] counts;
    int[] nums;
    public List<Integer> countSmaller(int[] nums) {
        this.nums=nums;
        int n=nums.length;
        counts= new int[n];
        int[] indices = new int[n];
        int[] temp= new int[n];
        for(int i=0;i<n;i++){
            indices[i]=i;
        }
        mergeSort(indices,temp,0,n-1);
        List<Integer> result= new ArrayList<>();
        for(int count: counts){
            result.add(count);
        }
        return result;
    }
    private void mergeSort(int [] indices, int[]temp, int left,int right){
        if(left>=right){
            return ;
        }
        int mid=left+(right-left)/2;
        mergeSort(indices,temp,left,mid);
        mergeSort(indices,temp,mid+1,right);
        merge(indices,temp,left,mid,right);

    }
    private void merge(int[] indices,int[]temp, int left, int mid,int right){
        int i=left;
        int j= mid+1;
        int k =left;
        while(i<=mid&& j<=right){
            if(nums[indices[i]]<=nums[indices[j]]){
                counts[indices[i]]+=j-(mid+1);
                temp[k++]=indices[i++];

            }else{
                temp[k++]=indices[j++];

            }
        }
        while(i<=mid){
            counts[indices[i]]+=j-(mid+1);
                temp[k++]=indices[i++];
        }
        while(j<=right){
            temp[k++]=indices[j++];  
        }
        for(int x=left;x<=right;x++){
            indices[x]=temp[x];
        }
    }
}