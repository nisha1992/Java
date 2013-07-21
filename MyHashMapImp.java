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



public class MyHashMapImp<T, E> 
{
public static Object keysave;
public int DefaultSize = 10,len=0,KeyIndex,I;
 
private Node<T, E> MapArray[];
 
public MyHashMapImp() 
{
MapArray = new Node[DefaultSize];
}
   
public MyHashMapImp(int capacity) 
{
MapArray = new Node[capacity];
}


public int size()
{
return len;
}


public E get(T key) 
{

throwIfKeyNull(key);
I=key.hashCode()%MapArray.length;
if(I<0)
KeyIndex=-1*I;
else
KeyIndex=I;
Node<T, E> obj = MapArray[KeyIndex];
while (obj != null && !key.equals(obj.getKey()))
obj = obj.getNext();
keysave=obj.getKey();
return obj != null ? (obj.getValue()) : null;

}
 
public void put(T key, E value) 
{
throwIfKeyNull(key);
 
I = key.hashCode()%MapArray.length;
if(I<0)
KeyIndex=-1*I;
else
KeyIndex=I;

Node<T, E> obj = MapArray[KeyIndex];
 
if (obj != null) 
{
boolean done = false;
while (!done) 
{
if (key.equals(obj.getKey())) 
{
obj.setValue(value);
done = true;
} 
else if (obj.getNext() == null) 
{
obj.setNext(new Node<T, E>(key, value));
done = true;
}
obj = obj.getNext();
}
} 
else 
{
if(len==DefaultSize)
{
MapArray=Arrays.copyOf(MapArray,MapArray.length*1000);
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
