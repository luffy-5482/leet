import java.util.regex.*;
class Solution {
    public boolean isMatch(String s, String p) {
        Pattern pat=Pattern.compile("^"+p+"$");
        Matcher mat=pat.matcher(s);
        if(mat.find())
        {
            return true;
        }
        else{
         return false;
        }
    }
}