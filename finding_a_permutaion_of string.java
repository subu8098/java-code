// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        String s2="acd";
        String s1="aadcabbcd";
        StringBuilder sb=new StringBuilder();
        int n=s1.length();
        boolean visit[]=new boolean[n];
        boolean s=permutation(s1,s2,sb,n,visit);
        System.out.println(s);
    }
    public static boolean permutation(String s1,String s2,StringBuilder sb,int n,boolean[] visit)
    {
        if(sb.length()==n)
        {
            return(sb.toString().contains(s2));
            
        }
        for(int i=0;i<n;i++)
        {
            if(!visit[i])
            {
                visit[i]=true;
                sb.append(s1.charAt(i));
                if(permutation(s1,s2,sb,n,visit))
                {
                    return true;
                }
                sb.deleteCharAt(sb.length()-1);
                visit[i]=false;
            }
        }
        return false;
    }
}