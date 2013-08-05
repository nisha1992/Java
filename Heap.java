import java.io.*;
import java.util.*;

class Node
{
int data,index;
Node()
{}
Node(int index,int data)
{
this.data=data;
this.index=index;
}

public int getIndex()
{
return index;
}
}

public class Heap
{
public int num,count,capacity;
public String heap_type;
ArrayList<Node> arr;

public Heap(int capacity,String heap_type)  //constructor
{
count=0;
this.heap_type=heap_type;
this.capacity=capacity;
arr=new ArrayList(capacity);
for(int i=0;i<capacity;i++)
arr.add(i,new Node(0,0));
}

public void makeHeap() throws IOException  //make heap
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
if(heap_type.equals("max"))
{
for(int i=0;i<capacity;i++)
{
System.out.println("Enter "+(i+1)+"th "+"node");
num=Integer.parseInt(br.readLine());
insertMax(i,num);
}
}
else
{
for(int i=0;i<capacity;i++)
{
System.out.println("Enter"+"\t"+(i+1)+"th"+"\t"+"node");
num=Integer.parseInt(br.readLine());
insertMin(i,num);
}
}
}

public int find(int ele)
{
int i;
Node t=null;
for(i=0;i<arr.size();i++)
{
t=(Node) arr.get(i);
if(t.data==ele)
break;
}
if(i!=arr.size())
return t.index;
else
return -1;
}

public void percolateDownMax(int i)   //heapify an element
{
int l,max,r;
Node temp;
l=left(i);
r=right(i);

if(l!=-1 && (((Node)arr.get(l)).data > ((Node)arr.get(i)).data))
{
max=l;
}
else
{
max=i;
}
if(r!=-1 && (((Node)arr.get(r)).data > ((Node)arr.get(max)).data))
max=r;
if(max!=i)
{
temp=((Node)arr.get(i));
arr.set(i,((Node)arr.get(max)));
arr.set(max,temp);
percolateDownMax(max);
}
}

public void percolateDownMin(int i)   //heapify an element
{
int l,min,r;
Node temp;
l=left(i);
r=right(i);

if(l!=-1 && (((Node)arr.get(l)).data < ((Node)arr.get(i)).data))
{
min=l;
}
else
{
min=i;
}
if(r!=-1 && (((Node)arr.get(r)).data < ((Node)arr.get(min)).data))
min=r;
if(min!=i)
{
temp=((Node)arr.get(i));
arr.set(i,((Node)arr.get(min)));
arr.set(min,temp);
percolateDownMin(min);
}
}

public int search(int d)   //search return index 
{
int i;
for(i=0;i<arr.size();i++)
{
if((((Node)arr.get(i)).data) == d)
break;
}
if(i!=arr.size())
return i;
else
return -1;
}


public int left(int d)    //find left
{
int left=2*d+1;
if(left>=count)
return -1;
else
return left;
}

public int right(int d)    //find right
{
int right=2*d+2;
if(right>=count)
return -1;
else
return right;
}

public int findLeft(int d)    //find left
{
int k=search(d);
int left=2*k+1;
if(left>=count)
return -1;
else
{
Node n=(Node) arr.get(left);
return n.data;
}
}

public int findRight(int d)    //find right
{
int k=search(d);
int right=2*k+2;
if(right>=count)
return -1;
else
{
Node n=(Node) arr.get(right);
return n.data;
}
}

public int findParent(int d)    //find parent
{
int k=search(d);
if(k<=0 ||k>=count)
return -1;
else
return (((Node)arr.get((k-1)/2)).data);
}


public void insertMax(int in,int n)   //max heap
{
Node newNode=new Node(in,n);
int m;
count++;
m=count-1;
while(m>0 && n > (((Node)arr.get((m-1)/2)).data))
{
arr.set(m,((Node)arr.get((m-1)/2)));
m=(m-1)/2;
}
arr.set(m,newNode);
}

public boolean isEmpty()
{
if(count!=0)
return false;
else
return true;
}


public void insertMin(int in,int n)   //min heap
{
Node newNode=new Node(in,n);
int m;
count++;
m=count-1;
while(m>0 && n < (((Node)arr.get((m-1)/2)).data))
{
arr.set(m,((Node)arr.get((m-1)/2)));
m=(m-1)/2;
}
arr.set(m,newNode);
}

public int deleteMax()   //delete max
{
if(count==0)
return -1;
else
{
int d=((Node)arr.get(0)).data;
arr.set(0,((Node)arr.get(count-1)));
this.count--;
percolateDownMax(0);
return d;
}
}

public int deleteMin()   //delete min
{
if(count==0)
return -1;
else
{
int d=((Node)arr.get(0)).data;
arr.set(0,((Node)arr.get(count-1)));
this.count--;
percolateDownMin(0);
return d;
}
}

public void display()
{
System.out.println(arr.size());
for(int i=0;i<count;i++)
{
Node p=(Node)arr.get(i);
System.out.println(p.index+" "+p.data);

}
}

public static void main(String arg[]) throws IOException
{
Heap h=new Heap(6,"min");
Heap h1=new Heap(5,"min");
h.makeHeap();
System.out.println("par6="+h.findParent(9));
System.out.println("left6="+h.findLeft(9));
System.out.println("right6="+h.findRight(9));
h.deleteMin();
System.out.println("after delete");
System.out.println("par6="+h.findParent(9));
System.out.println("left6="+h.findLeft(9));
System.out.println("right6="+h.findRight(9));
h.display();
}

}
