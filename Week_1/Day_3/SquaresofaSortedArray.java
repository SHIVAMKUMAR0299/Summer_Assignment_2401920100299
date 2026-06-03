class Solution {
    public int[] sortedSquares(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];

        }
        int mindex = 0;
        for (int i = 0; i < arr.length; i++) {
            mindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mindex]) {
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        return arr;
    }
}