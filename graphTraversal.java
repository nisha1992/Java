import java.util.LinkedList;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

class graphTraversal
{
  int v;
  LinkedList<Integer> arr[];
  String color[];
  int time=0;
  int parent[];
  int distance[];
  int finish[];
  int start[];

  graphTraversal(int vertices)
  {
    v=vertices;
    color=new String[v];
    parent=new int[v];
    start=new int[v];
    finish=new int[v];
    distance=new int[v];
    arr=new LinkedList[v];
    for(int i=0;i<v;i++)
    {
      arr[i]=new LinkedList();
    }
  }
  
  public void hasElement(int i)
  {
    System.out.println(arr[i].isEmpty());
  } 
  
  public void isEdge(int i,int j)
  {
    System.out.println(arr[i].contains(j));
  }
  
  
  public void displayDFS()
  {
    for(int i=0;i<v;i++)
    System.out.println(i+"\t"+arr[i]);
    System.out.println("start time:");
    for(int i=0;i<v;i++)
    System.out.print(" "+start[i]);
    System.out.println();
    System.out.println("finish time:");
    for(int i=0;i<v;i++)
    System.out.print(" "+finish[i]);
    System.out.println();
    System.out.println("color:");
    for(int i=0;i<v;i++)
    System.out.print(" "+color[i]);
    System.out.println();
    System.out.println("parent:");
    for(int i=0;i<v;i++)
    System.out.print(" "+parent[i]);
    System.out.println();
  }
  
  
  public void addEdge(int source,int destination)
  {
    arr[source].addLast(destination);
  }
  
  public void DFS()
  {
    for(int i=0;i<v;i++)
    {
      color[i]="white";
      parent[i]=i;
      start[i]=0;
    }
    for(int i=0;i<v;i++)
    {
      if(color[i].equals("white"))
      {
        DFS_VISIT(i);
      }
    }
  }
  
  public void DFS_VISIT(int u)
  {
    ListIterator<Integer> list=arr[u].listIterator();
    color[u]="grey";
    time=time+1;
    start[u]=time;
    while(list.hasNext())
    {
      int z=list.next();
      if(color[z].equals("white"))
      {
        parent[z]=u;
        DFS_VISIT(z);
      }
    }
    color[u]="black";
    time=time+1;
    finish[u]=time;
  }
  
  public void BFS()
  {
  MyQueue<Integer> que=new MyQueue();
  for(int i=0;i<v;i++)
  {
    color[i]="white";
    distance[i]=0;
    parent[i]=i;
  }
  color[0]="grey";
  distance[0]=0;
  que.insert(0);
  while(que.size()!=0)
  {
    int d=que.delete();
    ListIterator<Integer> itr=arr[d].listIterator();
    while(itr.hasNext())
    {
      int in=itr.next();
      if(color[in].equals("white"))
      {
        color[in]="grey";
        distance[in]=distance[d]+1;
        parent[in]=d;
        que.insert(in);
      }
    }
    color[d]="black";
  }
}
  
  public void displayBFS()
  {
  for(int i=0;i<v;i++)
  System.out.println(i+"\t"+arr[i]);
  System.out.println("distance:");
  for(int i=0;i<v;i++)
  System.out.print(" "+distance[i]);
  System.out.println();
  System.out.println("color:");
  for(int i=0;i<v;i++)
  System.out.print(" "+color[i]);
  System.out.println();
  System.out.println("parent:");
  for(int i=0;i<v;i++)
  System.out.print(" "+parent[i]);
  System.out.println();
  }
  
  
  public static void main(String arg[]) throws IOException
  {
  graphTraversal a=new graphTraversal(8);
  a.addEdge(0,1);
  a.addEdge(0,3);
  a.addEdge(1,0);
  a.addEdge(1,2);
  a.addEdge(3,0);
  a.addEdge(3,7);
  a.addEdge(3,4);
  a.addEdge(4,3);
  a.addEdge(4,7);
  a.addEdge(4,5);
  a.addEdge(4,6);
  a.addEdge(5,4);
  a.addEdge(5,6);
  a.addEdge(6,7);
  a.addEdge(6,4);
  a.addEdge(6,5);
  a.addEdge(7,3);
  a.addEdge(7,4);
  a.addEdge(7,6);
  System.out.println("DFS");
  a.DFS();
  a.displayDFS();
  System.out.println("BFS");
  a.BFS();
  a.displayBFS();
  }
  }
