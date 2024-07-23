class Solution {
    public int orangesRotting(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        Queue<int[]> q=new LinkedList<>();
       int[][] visit=grid; 
       int f=0;
       //visit=grid;
       for(int i=0;i<r;i++)
       {
        for(int j=0;j<c;j++)
        {
            if(visit[i][j]==2)
            {
                q.add(new int[]{i,j});
                f++;
            }
           else if(visit[i][j]==1) f++;

        }
       }
       if(f==0)
         return 0;
       //System.out.println(q);
       while(!q.isEmpty())
       {
        int s=q.size();
        for(int i=0;i<s;i++)
        {
        int[] arr=q.remove();
        int row=arr[0];
        int col=arr[1];
          //q.poll();
          if(row-1>=0&&visit[row-1][col]==1)
          {
            visit[row-1][col]=2;
            q.add(new int[]{row-1,col});
          }
          if(row+1<r&&visit[row+1][col]==1)
          {
            visit[row+1][col]=2;
            q.add(new int[]{row+1,col});
          }
          if(col-1>=0&&visit[row][col-1]==1)
          {
            visit[row][col-1]=2;
            q.add(new int[]{row,col-1});
          }
          if(col+1<c&&visit[row][col+1]==1)
          {
            visit[row][col+1]=2;
            q.add(new int[]{row,col+1});
          }
        }
         count++;
         //System.out.println(count);
       }
       for(int i=0;i<r;i++)
       {
        for(int j=0;j<c;j++)
        {
            if(visit[i][j]==1)
            {
                return -1;
            }
        }
       }
       return count-1;
    }
}