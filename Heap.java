import java.io.*;
import java.util.*;
public class Heap
{
public int num,count,capacity;
public String heap_type;
public int arr[];

public Heap(int capacity,String heap_type)  //constructor
{
count=0;
this.heap_type=heap_type;
this.capacity=capacity;
arr=new int[capacity];
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
insertMax(num);
}
}
else
{
for(int i=0;i<capacity;i++)
{
System.out.println("Enter"+"\t"+(i+1)+"th"+"\t"+"node");
num=Integer.parseInt(br.readLine());
insertMin(num);
}
}
}

public void percolateDown(int i)   //heapify an element
{
int l,max,temp,r;
l=left(i);
r=right(i);

if(l!=-1 && arr[l] > arr[i])
{
max=l;
}
else
{
max=i;
}
if(r!=-1 && arr[r] > arr[max])
max=r;
if(max!=i)
{
temp=arr[i];
arr[i]=arr[max];
arr[max]=temp;
percolateDown(max);
}
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
int left=2*d+1;
if(left>=count)
return -1;
else
return arr[left];
}

public int findRight(int d)    //find right
{
int right=2*d+2;
if(right>=count)
return -1;
else
return arr[right];
}

public int findParent(int d)    //find parent
{
if(d<=0 ||d>=count)
return -1;
else
return arr[(d-1)/2];
}

public void insertMax(int n)   //max heap
{
int m;
count++;
m=count-1;
while(m>0 && n > arr[(m-1)/2])
{
arr[m]=arr[(m-1)/2];
m=(m-1)/2;
}
arr[m]=n;
}

public void insertMin(int n)    //min heap
{
int min;
count++;
if(count==1)
{
arr[count-1]=n;
}
else
{
min=count-1;
while(min>0 && n < arr[(min-1)/2])
{
arr[min]=arr[(min-1)/2];
min=(min-1)/2;
}
arr[min]=n;
}
}

public int deleteMax()
{
if(count==0)
return -1;
else
{
int data=arr[0];
arr[0]=arr[count-1];
this.count--;
percolateDown(0);
return data;
}
}

public static void main(String arg[]) throws IOException
{
Heap h=new Heap(11,"max");
h.makeHeap();
System.out.println("par6="+h.findParent(2));
System.out.println("left6="+h.findLeft(2));
System.out.println("right6="+h.findRight(2));
h.deleteMax();
h.deleteMax();
System.out.println("After delete:");
System.out.println("par6="+h.findParent(2));
System.out.println("left6="+h.findLeft(2));
System.out.println("right6="+h.findRight(2));
}

}
