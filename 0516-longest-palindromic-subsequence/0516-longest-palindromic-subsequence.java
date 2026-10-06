class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] dp=new int[s.length()][s.length()];
        for(int[] d:dp) Arrays.fill(d,-1);
        return finddp(s,0,s.length()-1,dp);
    }
    static int finddp(String s,int i,int j,int[][]dp){
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==s.charAt(j)) return dp[i][j]=finddp(s,i+1,j-1,dp)+2;
        else return dp[i][j]=Math.max(finddp(s,i+1,j,dp),finddp(s,i,j-1,dp));
    }
}