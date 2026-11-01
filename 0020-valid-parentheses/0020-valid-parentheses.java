class Solution {
    public boolean isValid(String s) {
       Deque<Character> par = new ArrayDeque<>();
       for(char c:s.toCharArray()){
        if(c=='(')
        par.push(')');
        else if(c=='{')
        par.push('}');
        else if(c=='[')
        par.push(']');
        else if(par.isEmpty() || par.pop() !=c)
        return false;

       }
       return par.isEmpty();
    }
}