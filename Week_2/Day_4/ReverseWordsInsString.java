class Solution {
    public String reverseWords(String S) {
        char[] s = S.toCharArray(); 
        int i = 0;
        int j = 1;
        while( i<j && j< s.length ){
            if(s[j] == ' ' || j == s.length-1) {
                 int k = i;
                 int l = j-1;
                 if( j == s.length -1) l++;;
                 while(k<l){
                      char temp = s[l];
                      s[l] = s[k];
                      s[k] = temp;
                      k++;
                      l--;
                    }
                i = j+1;
                j=i+1;
            }
            else j++;
        }
        return new String(s);
    }
}