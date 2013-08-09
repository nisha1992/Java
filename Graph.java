import java.util.LinkedList;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

class Graph
{
int v;
int weight[][];
LinkedList<Integer> arr[];
public Graph(int vertices)
{
v=vertices;
weight=new int[v][v];
arr=new LinkedList[v];
for(int i=0;i<v;i++)
{
arr[i]=new LinkedList();

}
}

public int vertexCount()
{
return v;
}

public void hasElement(int i)
{
System.out.println(arr[i].isEmpty());
} 

public void isEdge(int i,int j)
{
System.out.println(arr[i].contains(j));
}


public void display()
{
for(int i=0;i<v;i++)
{
ListIterator l=arr[i].listIterator();
while(l.hasNext())
{
Integer ex=(Integer) l.next();
System.out.print(i+"--->"+ex+" ");
System.out.println(weight[i][ex]);
}
}


/*for(int i=0;i<v;i++)
{
System.out.println(i+"\t"+arr[i]);
}*/
}

public void edge(int source,int destination,int w)
{
arr[source].addLast(destination);
weight[source][destination]=w;
}


public static void main(String arg[]) throws IOException
{
Graph o=new Graph(6);
o.edge(0,1,5);
o.edge(0,3,4);
o.edge(1,4,3);
o.edge(2,4,11);
o.edge(2,5,56);
o.edge(3,1,55);
o.edge(4,3,66);
o.edge(5,5,77);
o.display();
o.isEdge(0,4);
System.out.println(o.vertexCount());
}
}
