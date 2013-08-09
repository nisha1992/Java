import java.io.*;
import java.util.LinkedList;
import java.util.*;
class shortestPath
{

public void dijkastra(Graph g,int source)
 {
  Integer c=(Integer)g.vertexCount();
 int path[]=new int[10];
 int distance[]=new int[10];
 Heap h=new Heap(c,"min");
 for(int i=0;i<c;i++)
 distance[i]=-1;
 distance[source]=0;
 h.insertMin(source);
  while(!h.isEmpty())
  {
  System.out.println(h.count);
  int v=h.deleteMin();
  System.out.println("d"+v);
  ListIterator l=g.arr[v].listIterator();
   while(l.hasNext())
   {
   Integer ex=(Integer) l.next();
   System.out.println("ex"+ex);
   int newd=distance[v]+g.weight[v][ex];
    if(distance[ex]==-1)
    {
    distance[ex]=newd;
    h.insertMin(newd);
    h.index[newd]=ex;
    path[ex]=v;
    }
    else if(distance[ex] > newd)
    {
    System.out.println("else");
    distance[ex]=newd;
    Integer temp=(Integer) h.find(ex);
    h.arr[temp]=newd;
    path[ex]=v;
    }
   }
  }
for(int k=0;k<c;k++)
    {
    System.out.println(0+"----->"+k+" "+distance[k]+" "+path[k]);  
    }

 }
    
 public static void main(String arg[])
 {     
 Graph o=new Graph(5);
o.edge(0,1,10);
o.edge(0,4,5);
o.edge(1,2,1);
o.edge(1,4,2);
o.edge(2,3,4);
o.edge(3,2,6);
o.edge(3,0,7);
o.edge(4,3,2);
o.edge(4,1,3);
o.edge(4,2,9);
shortestPath s=new shortestPath();
s.dijkastra(o,0);

 }

}
