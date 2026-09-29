class Solution {
    static boolean isClose(char c){
        return c==')'||c=='}'||c==']';
    }
    static boolean isMatch(char c1, char c2){
        return (c1=='('&&c2==')')||(c1=='{'&&c2=='}')||(c1=='['&&c2==']');
    }
    public boolean isValid(String s) {
     Stack<Character> st=new Stack<>();
     for(int i=0;i<s.length();i++){
        if(!st.isEmpty()&&isClose(s.charAt(i))){ 
            if(isMatch(st.peek(),s.charAt(i))) st.pop();
            else return false;
        }
        else if(st.isEmpty()&&isClose(s.charAt(i))) return false;
        else st.push(s.charAt(i));
     }
     return st.isEmpty();   
    }
}