class Solution {
    public int uniquePaths(int m, int n) {
        int[][] a = new int[m][n];
        for(int[] arr : a){
            Arrays.fill(arr,-1);
        }
      return path(a,m-1,n-1);
        
    }
    public int path(int[][] a, int m , int n){
        if(a[m][n] != -1){
            return a[m][n];
        }
        if(m==0 || n== 0){
            return a[m][n] =1;
        }
        return a[m][n] =  path(a,m-1,n)+path(a,m,n-1);
    }
}