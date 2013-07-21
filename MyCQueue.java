import java.io.*;
import java.util.*;
class MyCQueue<T>
{
private int FRONT,REAR;
//private int MAXSIZE=10000;
private int DEFAULTSIZE=10;
private Object arr[];
MyCQueue()
{
FRONT=-1;
REAR=-1;
arr=new Object[DEFAULTSIZE];
}


public void insert(T o)
{
if(FRONT==(REAR+1)%DEFAULTSIZE)
{
System.out.println("overflow!!");
}
else
{
REAR=(REAR+1)%DEFAULTSIZE;
arr[REAR]=o;
}
if(FRONT==-1)
FRONT=0;
}

public void displayAll()
{
if(REAR==-1 && FRONT==-1)
{
System.out.println("Queue is empty!!");
}
for(int i=FRONT;i<=REAR;i=(i+1)%DEFAULTSIZE)
{
System.out.print(arr[i]+",");
}
}

public T delete()
{
if(REAR==-1 && FRONT==-1)
{
System.out.println("Queue is empty!!");
}
T obj=(T) arr[FRONT];
if(FRONT==REAR)
FRONT=-1;
FRONT=(FRONT+1)%DEFAULTSIZE;
return obj;
} 


}
