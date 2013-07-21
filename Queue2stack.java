class Queue2stack
{
public static void main(String arg[])
{
MyQueue<Integer> o1=new MyQueue();
MyQueue<Integer> o2=new MyQueue();
int flag=1;
int array[]={1,2,3,4,5};
o1.insert(array[0]);
o2.insert(array[1]);
o2.insert(o1.delete());
for(int i=2;i<array.length;i++)
{
if(flag==1)
{
o1.insert(array[i]);
while(o2.getTop()!=0)
{
o1.insert(o2.delete());
}
flag=0;
}

else
{
o2.insert(array[i]);
while(o1.getTop()!=0)
{
o2.insert(o1.delete());
}
flag=1;
}
}

o2.displayAll();
o1.displayAll();
System.out.println();

}
}
