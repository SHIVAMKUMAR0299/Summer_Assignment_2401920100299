class Solution {
    public static boolean valid(int i, int j, char[] arr) {
        int k = j;
        for (i = i; i < k; i++) {    
                if (arr[i] == arr[j]){
                    return false;
            }
        }
        return true;

    }

    public int lengthOfLongestSubstring(String s) {
        char[] a = s.toCharArray();
        if (a.length <= 2) {
            if (a.length == 2 && a[0] == a[1])
                return 1;
            return a.length;
        }

        int i = 0;
        int j = 1;
        int ml = 1;

        while (i < a.length && j < a.length) {
            if (valid(i, j, a)) {

                ml = Math.max(ml, (j - i+1));
                j++;
            }
            else {
                i++;
                j = i + 1;
            }
        }
        return ml;
    }
}