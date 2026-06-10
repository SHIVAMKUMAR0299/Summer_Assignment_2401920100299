class Solution {
    public static boolean valid(int i, int j, String n, String h) {
        int p = 0;
        for (int k = i; k <= j; k++) {
            if (n.charAt(p) != h.charAt(k)) {
                return false;
            }
             p++;
        }
        return true;
    }

    public int strStr(String h, String n) {
        if (n.length() > h.length())
            return -1;
        // char[] n = needle.toCharArray();
        // char[] h = haystack.toCharArray();
       
        int i = 0;
        int j = n.length()-1;
        while (j < h.length()  ) {
            if (valid(i, j, n, h))
                return i;
            else {
                i++;
                j++;
            }

        }
        return -1;

    }
}