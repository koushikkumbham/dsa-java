class Solution {
    public int scoreOfParentheses(String s) {
        int sum=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') c++;
            else{
            c--;
            if(i>0 && s.charAt(i-1)=='('){
                sum+=1<<c;
            }
            }
        }
        return sum;
    }
}