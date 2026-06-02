class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int  sum = arr[0];
        double maxsum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length-k+1;i++){
            sum = 0;
            for(int j = i;j<i+k;j++){
                sum = sum + arr[j];
                // maxsum = Math.max(sum,maxsum);
            }
             maxsum = Math.max(sum,maxsum);
        }
        return maxsum/k;

    }
}