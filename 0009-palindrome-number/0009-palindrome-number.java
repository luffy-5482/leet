class Solution {
    public boolean isPalindrome(int x) {
        int c=x;
        if(x==0)
        return true;
        if(x<0)
        return false;
        if(x%10==0)
        return false;
        int res=0;
        while(x!=0){
          int a=0;
          a=x%10;
          res=(res*10)+a;
          x/=10;
        }
        if(res==c){
            return true;
        }
        else{
            return false;
        }
    }
}