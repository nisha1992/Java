import java.util.Arrays;
public class ArrayLI<T>
{
Object a[];
private int maxcapacity=10;
private int len;
ArrayLI()
{

a=new Object[maxcapacity];
len=0;
}


public Object get(int index)  //return value at some index
{
if(index < len)
return a[index]; 
else 
throw new ArrayIndexOutOfBoundsException();
}
 
public int size()    //size of array method
{
return len;
}    

public void add(T obj)   //add an element in the array
{
if(len == maxcapacity)
{

a = Arrays.copyOf(a, a.length*2);
}
a[len]=obj;
len++;
}

public void add(int index,T obj)   //add element at some index
{
if(len == maxcapacity)
{

a = Arrays.copyOf(a, a.length*2);
}
else if(index>maxcapacity)
{
throw new  ArrayIndexOutOfBoundsException();
}
else
{
for(int i=len;i>=index;i--)
{
a[i+1]=a[i];
a[i]=null;
}
a[index]=obj;
len++;
}

}
}
