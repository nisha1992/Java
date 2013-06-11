import java.io.*;
class Array012
{
private static int n;
public static void Sort(int a[])
{
int two=0,one=0,temp;
for(int i=0;i<n;i++)
{
if(a[i]==0)
{
temp=a[two];
a[two]=a[i];
a[i]=temp;
temp=a[two];
a[two]=a[one];
a[one]=temp;
two++;
one++;
}
if(a[i]==1)
{
temp=a[two];
a[two]=a[i];
a[i]=temp;
two++;
}
}
System.out.println("Sorted Array is:  ");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
public static void main(String args[]) throws IOException
{
System.out.println("Enter the number of elements:");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
int array[]=new int[n];
System.out.println("Enter the Array Elements:");
for(int i=0;i<n;i++)
{
array[i]=Integer.parseInt(br.readLine());
}
Sort(array);
}
}

