import java.util.regex.*;
import java.util.*;
class Solution {
    public int myAtoi(String s) {
        Pattern p=Pattern.compile("^\\s*([+-]?\\d+)");
        Matcher m=p.matcher(s);
        if(m.find())
        {
        String hey= m.group(1);
        try{
            return Integer.valueOf(hey);
        }
        catch(NumberFormatException e)
        {
             return hey.startsWith("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        }
          return 0;  
    }
}