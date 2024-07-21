class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
     int[][] arr=image;
     int ini=image[sr][sc];
    //  if (ini == color) {
    //         return arr; // if the initial color is the same as the new color, return the original image
    //     }
     dfs(ini,arr,sr,sc,color); 
      return arr;  
    }
    void dfs(int ini,int[][] arr,int sr,int sc,int color)
    {
        int row=arr.length;
        int col=arr[0].length;
        if(sr>=0&&sc>=0&&sr<row&&sc<col&&arr[sr][sc]==ini&&arr[sr][sc]!=color)
        {
            arr[sr][sc]=color;
            dfs(ini,arr,sr-1,sc,color);
            dfs(ini,arr,sr+1,sc,color);
            dfs(ini,arr,sr,sc-1,color);
            dfs(ini,arr,sr,sc+1,color);
        }
    }
}