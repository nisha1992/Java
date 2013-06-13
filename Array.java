import java.io.*;
class Array
{
private static int n;

public static void MaxSubarray(int a[])
  {
  int sum=0,in=0,count=0;
  int subarr[]=new int[n];
  for(int i=0;i<n;i++)
   {
   if(a[i]+sum >sum)
    {
    subarr[in]=a[i];
    sum=a[i]+sum;
    in++;
    count=in;
    }
    else 
    {
    in=0;
    sum=0;
    }
   }
   System.out.println("Subarray with maximum sum is: ");
   for(int i=0;i<count;i++)
    {
    System.out.println(subarr[i]);
    }
  }


public static void main(String arg[]) throws IOException
  {
  System.out.println("Enter the number of elements in an array:  ");
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  n=Integer.parseInt(br.readLine());
  int array[]=new int[n];
  System.out.println("Enter the array elements:");
  for(int i=0;i<n;i++)
   {
   array[i]=Integer.parseInt(br.readLine());
   }
  MaxSubarray(array);
  }
}
