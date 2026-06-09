class Solution {
      public static boolean valid(int i, int j, int[] freq1, char[] b) {
        int[] freq2 = new int[26];
        while (i <= j) {
            freq2[b[i] - 'a']++;
            i++;
        }
        for (int z = 0; z < 26; z++) {
            if (freq1[z] != freq2[z])
                return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
       
        // if (s.length() > p.length()) {
        //     return 0;
        // }
        char[] a = p.toCharArray();
        char[] b = s.toCharArray();
        int[] freq1 = new int[26];
        for (int i = 0; i < a.length; i++) {
            freq1[a[i] - 'a']++;
        }
         ArrayList<Integer> arr = new ArrayList();
        int i = 0;
        
        int j = a.length - 1;
        while ( j < b.length) {
            if (valid(i, j, freq1, b)){
                arr.add(i);
                i++;
                j++;
                
            }
                else {
                j++;
                 i++;
                }
        }
         return arr;
    }
}