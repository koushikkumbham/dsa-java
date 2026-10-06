class Solution {
    public int minDistance(String s1, String s2) {
        int[][] dp=new int[s1.length()][s2.length()];
        for(int[] d:dp) Arrays.fill(d,-1);
        return (finddp(dp,0,0,s1,s2));
    }
    
    static int finddp(int[][] dp,int i,int j,String s1,String s2){
    if(i==s1.length()) return s2.length()-j;
    if(j==s2.length())return s1.length()-i;
    if(dp[i][j]!=-1) return dp[i][j];
    if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]=finddp(dp,i+1,j+1,s1,s2);
    dp[i][j]=Math.min(finddp(dp,i+1,j,s1,s2),finddp(dp,i+1,j+1,s1,s2))+1;
    return dp[i][j]=Math.min(dp[i][j],finddp(dp,i,j+1,s1,s2)+1);
    }
}