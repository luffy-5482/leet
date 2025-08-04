class backtrack{
    public static void track(String digits,List <String> res,int idx,Map<Character, String> phoneMap,StringBuilder current){
          if(idx==digits.length())
          {
            res.add(current.toString());
            return;
          }

          char digit=digits.charAt(idx);
          String letters=phoneMap.get(digit);
          for(char letter : letters.toCharArray()){
            current.append(letter);
            track(digits,res,idx+1,phoneMap,current);
            current.deleteCharAt(current.length()-1);
          }
    }
}
class Solution {
    public List<String> letterCombinations(String digits) {
        List <String> res=new ArrayList<>();
        if(digits==null || digits.length()==0)
        return res;
        backtrack b = new backtrack();
         Map<Character, String> phoneMap = new HashMap<>();
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");
        b.track(digits,res,0,phoneMap,new StringBuilder());
        return res;
    }
}