import java.util.regex.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String sample;
        boolean flag;
        sample=strs[0];
        String result="";
        for(int i=0;i<sample.length();i++)
        {
            flag=true;
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length()||sample.charAt(i)!=strs[j].charAt(i))
                {
                    flag=false;
                }
            }
            if(!flag)
            break;
            else
            result+=String.valueOf(sample.charAt(i));
        }
        return result;
    }
}