class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int[][] dp=new int[s1.length()][s2.length()];
        for(int[] d:dp) Arrays.fill(d,-1);
        return finddp(s1,s2,0,0,dp);
    }
    static int finddp(String s1,String s2,int i,int j,int[][]dp){
        if(i>=s1.length()||j>=s2.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]=finddp(s1,s2,i+1,j+1,dp)+1;
        else return dp[i][j]=Math.max(finddp(s1,s2,i+1,j,dp),finddp(s1,s2,i,j+1,dp));
    }
}
    