class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int[][] visit=new int[row][col];
        int count=0;
     for(int i=0;i<row;i++)
     {
        for(int j=0;j<col;j++)
        {
           if(grid[i][j]=='1'&&visit[i][j]==0)
           {
            
            count++;
            dfs(i,j,visit,grid);
           }
        }
     }  
     return count; 
    }
    void dfs(int i,int j,int[][] visit,char[][] grid)
    {
        int rs=grid.length;
         int cs=grid[0].length;
      if(i>=0&&j>=0&&i<rs&&j<cs&&visit[i][j]==0&&grid[i][j]=='1')
      {
        visit[i][j]=1;
        dfs(i-1,j,visit,grid);
        dfs(i+1,j,visit,grid);
        dfs(i,j-1,visit,grid);
        dfs(i,j+1,visit,grid);
      }
       
    }
}
