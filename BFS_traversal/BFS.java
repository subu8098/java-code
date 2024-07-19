import java.util.*;
class BFS
{
    int n;
    LinkedList<Integer> list[];
   BFS(int n)
    {
        this.n=n;
        list=new LinkedList[n];
        for(int i=0;i<n;i++)
        {
            list[i]=new LinkedList();
        }
    }
    void addEdge(int i,int v)
    {
        list[i].add(v);
    }
    void bfs(int root)
    {
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[n];
        visited[root]=true;
        q.add(root);
        while(!q.isEmpty())
        {
            int node=q.poll();
            System.out.print(node+" ");
            for(int d:list[node])
            {
            if(!visited[d])
            {
                visited[d]=true;
                q.add(d);
            }
            }
        }
        
    }
    void adj()
    {
        for(int i=0;i<n;i++)
        {
            if(!list[i].isEmpty())
            System.out.print("index"+i+"=");
        for(int d:list[i])
          System.out.print(d+" ");  
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the vertices");
        int n=sc.nextInt();
        BFS ob=new BFS(n+1);
        System.out.println("Enter the edges");
        int e=sc.nextInt();
        for(int i=0;i<e;i++)
        {
            ob.addEdge(sc.nextInt(),sc.nextInt());
        }
       // ob.adj();
       //to show the BFS traversal
       ob.bfs(0);
        
    }
}
