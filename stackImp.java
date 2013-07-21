import java.util.Arrays;
import java.io.*;
import java.util.*;
public class stackImp<T>
{
private int top;
private int DEFAULT_CAPACITY=10;
private Object array[];

public stackImp()
{
top=0;
array=new Object[DEFAULT_CAPACITY];
}

public int size()
{
return top;
}

public T getTop()
{
if(top==0)
return null;
T o=(T) array[top];
return o;
}

public void push(T obj)
{
top=top+1;
if(top == DEFAULT_CAPACITY)
{
increCapacity();
}
array[top]=obj;
}

public T pop()
{
if(top==0)
return null;
T o=(T) array[top];
top=top-1;
return o;
}

private void  increCapacity()
{
array=Arrays.copyOf( array, array.length*2);
}

public void displayAll()
{
if(top==0)
System.out.println("Stack is empty!!");
else
{
for(int i=top;i>0;i--)
{
System.out.println(array[i]);
}
}
}
}
