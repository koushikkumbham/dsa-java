class Solution {
    public int jump(int[] nums) {
        int[] dp=new int[10001];
            Arrays.fill(dp,-1);
        if(nums.length==1){
            return 0;
        }
        return finddp(dp,nums,0);
    }
    static int finddp(int[] dp,int[] nums,int i){
        if(i==nums.length-1) return 0;
        if(dp[i]!=-1) return dp[i];
        int min_ans=Integer.MAX_VALUE/2;
        for(int j=1;j<=nums[i]&&i+j<nums.length;j++){
            min_ans=Math.min(min_ans,finddp(dp,nums,i+j)+1);
        }
        return dp[i]=min_ans;
    }
}