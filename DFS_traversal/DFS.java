import java.util.*;
class DFS
{
    int n;
    LinkedList<Integer> list[];
   DFS(int n)
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
    void dfsFind(int root,boolean[] visit)
    {
        visit[root]=true;
        System.out.print(root+" ");
        for(int d:list[root])
        {
            if(!visit[d])
            {
                dfsFind(d,visit);
            }
        }
    }
    void dfs(int root)
    {
        boolean[] visit=new boolean[n];
        dfsFind(root,visit);
        
        
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
        DFS ob=new DFS(n+1);
        System.out.println("Enter the edges");
        int e=sc.nextInt();
        for(int i=0;i<e;i++)
        {
            ob.addEdge(sc.nextInt(),sc.nextInt());
        }
     
       ob.dfs(0);
        
    }
}