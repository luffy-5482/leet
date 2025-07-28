class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int m = 0; 

        for (int i = 0; i < s.length(); i++) {
            int count = 0; 
            bool dup = false; 

            for (int j = i; j < s.length(); j++) {
                for (int k = i; k < j; k++) {
                    if (s[k] == s[j]) {
                        dup = true;
                        break;
                    }
                }

                if (dup) break; 

                count++; 
            }
            if (count > m) {
                m = count;
            }
        }

        return m; 
    }
};


//  class Solution {
//  public:
//      string a;
//     int c=0,lon=0,j=0;
    
//      int check(char c){
//          int size=a.size();
//          for(int i=0;i<size;i++)
//          {
//              if(a[i]==c)
//              {
//                  return 0;
//              }
//          }
//          return 1;
//      }
  
//      int lengthOfLongestSubstring(string s) {
//      int size=s.size();
//      for(int i=j;i<size;i++)
//      {
//        if(check(s[i])){
//          a+=s[i];
//          c++;
//        }
//    else{
//            lon=c>lon?c:lon;
//              c=0;
//              if(i<size)
//              {
//                 j++;
//                 i=j;
//              }
//        }    
//      }
//        lon=c>lon?c:lon;
//        c=0;
        
//      return lon;
//      } 
// }; 