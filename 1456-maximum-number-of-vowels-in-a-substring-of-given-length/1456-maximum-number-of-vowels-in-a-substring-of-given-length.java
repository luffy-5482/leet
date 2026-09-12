class Solution {
    public int maxVowels(String s, int k) {
        int answer = 0;
        int sum = 0;
        int ending = k-1;
        HashSet<Character> Vowels=new HashSet<>();
        Vowels.add('a');
        Vowels.add('e');
        Vowels.add('i');
        Vowels.add('o');
        Vowels.add('u');
        for (int i=0;i<k;i++){
            if(Vowels.contains(s.charAt(i)))
            sum++;
        }
        answer=sum;
        for (int i=k;i<s.length();i++){
            if(Vowels.contains(s.charAt(i-k)))
            sum--;

            if(Vowels.contains(s.charAt(i)))
            sum++;
            if(answer<sum)
            answer=sum;
        }
        return answer;
    }

}