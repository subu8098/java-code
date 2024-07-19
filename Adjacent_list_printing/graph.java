import java.util.*;
class graph
{
    int n;
    LinkedList<Integer> list[];
    graph(int n)
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
        graph ob=new graph(n);
        System.out.println("Enter the edges");
        int e=sc.nextInt();
        for(int i=0;i<e;i++)
        {
            ob.addEdge(sc.nextInt(),sc.nextInt());
        }
        ob.adj();
        
    }
}