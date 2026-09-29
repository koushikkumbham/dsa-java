class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return finddp(dp,nums.length-1,nums);
    }
    static int finddp(int[] dp,int i,int[] nums){
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i]=Math.max(finddp(dp,i-1,nums),finddp(dp,i-2,nums)+nums[i]);
    }
}