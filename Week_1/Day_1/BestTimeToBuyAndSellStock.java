class Solution {
    public int maxProfit(int[] arr) {
        int min = arr[0];
        int  maxprofit = 0;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i]<min){
                min = arr[i];
            }
            int profit = arr[i] -min;
            if(profit>maxprofit) {
                maxprofit = profit;
            }
        }
        return maxprofit;
        
    }
}