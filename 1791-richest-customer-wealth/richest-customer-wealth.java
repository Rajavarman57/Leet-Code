class Solution {
    public int maximumWealth(int[][] accounts) {
       int sum = 0, max = -1000000;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[0].length;j++){
                sum = sum+accounts[i][j];
            }
            if(sum>max){
                max=sum;
            }
            sum=0;
        }
        return max;
    }
}