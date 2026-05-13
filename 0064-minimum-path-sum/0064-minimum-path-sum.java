class Solution {
    public int minPathSum(int[][] grid) {
        int m =  grid.length;
        int n =  grid[0].length;
        int[][] a  = new int [m][n];
        for(int[] arr : a){
            Arrays.fill(arr,-1);
        }
        return path(a,grid,m-1,n-1);
    }
    public int path(int[][]a,int[][]grid,int m , int n ){
        if(a[m][n] != -1)return a[m][n];
        if(m==0  & n== 0)return grid[m][n];
        if(m==0) return a[m][n] = grid[m][n]+path(a,grid,m,n-1);
        if(n==0)return a[m][n] = grid[m][n]+path(a,grid,m-1,n);
        return a[m][n]= grid[m][n]+ Math.min(path(a,grid,m-1,n),path(a,grid,m,n-1));
    }
}