import java.io.*;
public class Array01sort
{
private static int n;

public static void Sort(int a[])     //Sort 0,1 array Method
  {
  int pre=0,temp;
   for(int i=0;i<n;i++)
   {
   if(a[i]==0)
    {
   temp=a[pre];
   a[pre]=a[i];
   a[i]=temp;
   pre++;
   } 
   }
   System.out.println("sorted array is:");
   for(int i=0;i<n;i++)
   System.out.println(a[i]);
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
   Sort(array);
  }

}




