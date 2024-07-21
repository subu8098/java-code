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
            bfs(i,j,visit,grid);
           }
        }
         System.out.println();
     }  
     return count; 
    }
    void bfs(int i,int j,int[][] visit,char[][] grid)
    {
        int rs=grid.length;
        int cs=grid[0].length;
        visit[i][j]=1;
        Queue<Pair<Integer,Integer>> q=new LinkedList<>();
        q.add(new Pair(i,j));
        while(!q.isEmpty())
        {
           int r = q.peek().getFirst();
           int c = q.peek().getSecond();
            q.remove();
          if(grid[r-1][c]=='1'&&r>=0&&c>=0&&r<rs&&c<cs)
          {
                visit[r-1][c]=1;
                q.add(new Pair(r-1,c));
          }
          if(grid[r+1][c]=='1'&&r>=0&&c>=0&&r<rs&&c<cs)
          {
            visit[r+1][c]=1;
            q.add(new Pair(r+1,c));
          }
          if(grid[r][c-1]=='1'&&r>=0&&c>=0&&r<rs&&c<cs)
          {
            visit[r][c-1]=1;
            q.add(new Pair(r,c-1));
          }
          if(grid[r][c+1]=='1'&&r>=0&&c>=0&&r<rs&&c<cs)
          {
            visit[r][c+1]=1;
            q.add(new Pair(r,c+1));
          }
    }
}
}