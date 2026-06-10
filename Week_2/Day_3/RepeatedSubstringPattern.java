class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length() <=1 ) return false;
        int k = 1;
        boolean flag = true;
        while(k<=s.length()/2 ){
            if(s.length()%k==0){
                for(int i = 0;i<s.length();i++){
                    if(s.charAt(i) != s.charAt(i%k)) {
                         flag = false;
                         break;
                         
                    }
                    else {
                        flag = true;
                        
                    }
                }
                k++;
                if(flag) break;
            }
            else k++;
        }
        return flag;
        
    }
}