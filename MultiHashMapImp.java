import java.util.Arrays;
class Node<T, E> 
{
   
private Node<T, E> next;
private final T key;
private E value;
 
public Node(T key, E value) 
{
this.key = key;
this.setValue(value);
}
 
public T getKey() 
{
return key;
}
 
public void setValue(E value) 
{
this.value = value;
}
 
public E getValue() 
{
return value;
}
 
public void setNext(Node<T, E> next) 
{
this.next = next;
}
 
public Node<T, E> getNext() 
{
return next;
}
}



public class MultiHashMapImp<T, E> extends Thread
{
ArrayLI<Integer> list=new ArrayLI(); 
private int DefaultSize = 10,len=0,KeyIndex,I;
 
private Node<T, E> MapArray[];
 
public MultiHashMapImp() 
{
MapArray = new Node[DefaultSize];
}
   
public MultiHashMapImp(int capacity) 
{
MapArray = new Node[capacity];
}
 
public void putAll()
{
try
{
if(((Integer)list.size()) ==0)
System.out.println("empty map!!!");
else
{
for(int i=0;i<((Integer)list.size());i++)
{
Node<T, E> o=MapArray[(Integer)list.get(i)];
System.out.println((Integer)list.get(i));
if(o!=null)
{
while(o!=null)
{
Thread.sleep(3000);
System.out.println("KEY:---"+o.getKey());
System.out.println(o.getValue());
o=o.getNext();
}
}
System.out.println();
}
}
}
catch(Exception e)
{}
System.out.println(size());
}


public int size()
{
return len;
}


public void get(T key) 
{
int valuecount=0
throwIfKeyNull(key);
I=key.hashCode()%10;
if(I<0)
KeyIndex=-1*I;
else
KeyIndex=I;
Node<T, E> obj = MapArray[KeyIndex];
for(Node<T, E> temp=obj;temp!=null;temp=temp.getNext())
{
if(key.equals(temp.getKey()))
{
valuecount++;
System.out.println(temp.getKey()+" \t "+temp.getValue());
}
}
System.out.println();
System.out.println(valuecount);
}
 
public void put(T key, E value) 
{
throwIfKeyNull(key);
 
I = key.hashCode()%10;
if(I<0)
KeyIndex=-1*I;
else
KeyIndex=I;
Node<T, E> obj = MapArray[KeyIndex];
 
if (obj != null) 
{
while(obj.getNext()!=null)
obj=obj.getNext();
obj.setNext(new Node<T, E>(key, value));
} 
else 
{
list.add(KeyIndex);
if(len==DefaultSize)
{
MapArray=Arrays.copyOf(MapArray,MapArray.length*10);
}
MapArray[KeyIndex] = new Node<T, E>(key, value);
len++;
}
}
 
private void throwIfKeyNull(T key)
{
if (key == null)
{
throw new IllegalArgumentException("key may not be null");
}
}
}
