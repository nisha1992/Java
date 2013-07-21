import java.io.*;
class Node
{
int data,weight;
Node next;
Node(int d)
{
data=d;
next=null;
}
Node(int d,int w)
{
data=d;
weight=w;
next=null;
}
}
class AdjacencyList
{
public static void main(String arg[]) throws IOException
{
Node Start,End;
int v,e,i,j,wt;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the no of vertices:");
v=Integer.parseInt(br.readLine());
Node array[]=new Node[100];
System.out.println("Enter the edges");
for(i=1;i<=v;i++)
{
array[i]=new Node(i);
for(j=1;j<=v;j++)
{
System.out.print(i+"to"+j+":");
e=Integer.parseInt(br.readLine());
if(e!=0)
{
System.out.print("weight of"+j+":");
wt=Integer.parseInt(br.readLine());
Node list=new Node(j,wt);
if(array[i].next==null)
{
array[i].next=list;
}
else
{
Node p=array[i].next;
while(p.next!=null)
{
p=p.next;
}
p.next=list;
}
}
}
}
System.out.println("\n\nAdjacency list with weights:\n"); 
for(i=1;i<=v;i++)
{
Node t=array[i].next;
while(t!=null)
{
System.out.print(array[i].data+"----->");
System.out.println(t.data+"="+t.weight);
t=t.next;
}
}
}
}
