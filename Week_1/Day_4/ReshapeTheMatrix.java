class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] arr = new int[r][c];
        int k = mat.length, l = mat[0].length;
        if(k*l != r*c) {
            return mat;
        }
        k = 0;
        l=0;
        for (int i = 0; i < r; i++) {
           
            for (int j = 0; j < c; j++) {
                 arr[i][j] = mat[k][l];
                 l++;
                 if(l==mat[0].length) {
                  l=0;
                  k++;
                 }
            }
            
        }
        return arr;
    }
}S