import java.io.*;
import java.util.*;
class sortArrayByFrequency
{
sorting s=new sorting();
ArrayList<Integer> arr=new ArrayList();
Hashtable<Integer,Integer> table=new Hashtable();
 public void sort(int a[])   //sort according to frequency
 { 
  Integer p=0,z=0;
   for(int i=0;i<a.length;i++)
   {
    if(table.containsKey(a[i]))
    {
    Integer temp=(Integer)table.get(a[i]);
    temp=temp+1;
    table.put(a[i],temp);
    }
    else
    {
    table.put(a[i],1);
    }
   }
   Set<Integer> keys=table.keySet();
   for(Integer i:keys)
   {
   Integer save=(Integer)table.get(i);
   arr.add(save);
   }
   Collections.sort(arr);
   System.out.println("array sort according to frequencies:");
   Iterator it1=arr.iterator();
   while(it1.hasNext())
   {
   Integer temp=(Integer)it1.next();
   //Set<Integer> keys1=table.keySet();
   for(Integer k:keys)
     {
     p=(Integer)table.get(k);
     if(p.equals(temp))
     {
     z=k; 
     table.remove(k);
     break;
     }
     }
     for(int i=0;i<temp;i++)
     {
     System.out.print(z+" ");
     }
   }
 }
  
 public static void main(String arg[]) throws IOException
 {
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 sortArrayFrequency obj=new sortArrayFrequency();
 int size;
 System.out.println("Enter the array size:");
 System.out.println("size:");
 size=Integer.parseInt(br.readLine());
 System.out.println("Enter the array elements:");
 int a[]=new int[size];
  for(int i=0;i<size;i++)
  {
   a[i]=Integer.parseInt(br.readLine());
  }
  obj.sort(a);
 }
}
