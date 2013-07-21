import java.io.*;
class Node
{
int data;
public Node next;
Node()
{} 
Node(int d)
{
data=d;
next=null;
} 
}

class LinkedList
{

public static void main(String arg[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,num,n1,n2,op,len=0;
Node Start,End,t;
Start=null;
End=Start;
while(true)
{
System.out.println("1.Insert at the beginning. \n 2.Insert at the end. \n 3.Insert after nth node. \n 4.Reverse. \n 5.Display ");

System.out.println("enter the option");
op=Integer.parseInt(br.readLine());


switch(op)
{

case 1:

System.out.println("enter the no. to insert");
num=Integer.parseInt(br.readLine());
Node obj=new Node(num);
if(Start == null)
{
Start=End=obj;

}
else
{
obj.next=Start;
Start=obj;



}
len++;
break;

case 2:

System.out.println("enter the no. to insert");
n=Integer.parseInt(br.readLine());
Node obj1=new Node(n);
if(Start == null)
{
Start=End=obj1;
}
else
{
End.next=obj1;
End=obj1;
}
len++;
break;

case 3:

System.out.println("Enter the node after which no. is to be inserted");
n1=Integer.parseInt(br.readLine());
System.out.println("enter the no. to insert");
n2=Integer.parseInt(br.readLine());
Node obj2=new Node(n2);
Node p=Start;
while(p.next!=null)
{
if(p.data == n1)
{
obj2.next=p.next;
p.next=obj2;
}
p=p.next;
}
break;

case 4:

Node temp=null;
Node temp1=null;
t=Start;
if(len>0)
{
while(t!=null)
{
temp=t.next;
t.next=temp1;
temp1=t;
t=temp;
}
for(Node t1 = temp1;t1!=null;t1=t1.next)  
System.out.print(t1.data + "\t");  
System.out.println();
}


else System.out.println("LinkedList is empty");  
break;  

case 5:

if(len>0)

{  
for(t = Start;t!=null;t=t.next)  
System.out.print(t.data + "\t");  
System.out.println();}  
        
else System.out.println("LinkedList is empty");  
break;  
 
default: System.exit(0);  
}
}
}
}
