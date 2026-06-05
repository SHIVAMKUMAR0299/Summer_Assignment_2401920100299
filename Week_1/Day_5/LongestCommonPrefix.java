class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            min = Math.min(strs[i].length(), min);
        }
        StringBuilder s1 = new StringBuilder();

        for (int i = 0; i < min; i++) {
        
            for (int j = 0; j < strs.length - 1; j++) {

                if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                    return s1.toString();
            
                }
                
            }
            s1.append(strs[0].charAt(i));
        }
        return s1.toString();
    }
}