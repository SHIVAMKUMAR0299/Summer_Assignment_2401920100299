class Solution {
    public boolean canConstruct(String ransomNote, String magazine) { 

       char[] a = ransomNote.toCharArray();
       char[] b = magazine.toCharArray();

       if(a.length>b.length) return false;

       int[] freqa = new int[26];
       int[] freqb = new int[26];
       for(int i = 0;i<a.length;i++){
           freqa[a[i]-'a']++;
       } 
       for(int i = 0;i<b.length;i++){
           freqb[b[i]-'a']++;
       } 
       for(int i = 0;i<26;i++){
        if(freqa[i] > freqb[i] ) return false;
       } 
       return true;
    }
}