import java.io.*;
class MaxSubArray
{
private static int n;

public static void MaxSubarray(int a[])
  {
  int sum=0,max=sum;
  int subarr[]=new int[n];
  for(int i=0;i<n;i++)
   {
   sum=sum+a[i];
   if(sum >max)
    {
    max=sum;
    }
    else if(sum <0)
    {
    sum=0;
    }
   }
   System.out.println("maximum sum of subarray is: ");
    System.out.println(max);
   
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
