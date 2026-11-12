class Solution {
    public int diagonalSum(int[][] mat) {
       int ps=0;
       int n= mat.length;
       int ss=0;
        int sum=0;
        for(int i=0;i<mat.length;i++){
            ps+=mat[i][i];
            ss+=mat[i][n-1-i];
           
        }
         sum=ps+ss;
         if(n%2==1){
            sum-=mat[n/2][n/2];
         }
        return sum;
    }
}