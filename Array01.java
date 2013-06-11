import java.io.*;
public class Array01
{
private static int n;
public static void Sort(int a[])     //Sort 0,1 array Method
  {
  int p=0,l=n-1;
  int sortarray[]=new int[n];
   for(int i=0;i<n;i++)
   {
   if(a[i]==0)
    {
    sortarray[p]=a[i];
    p++;
    }
    else
    {
    sortarray[l]=a[i];
    l--;
    }
   }
   System.out.println("sorted array is:");
   for(int i=0;i<n;i++)
   System.out.println(sortarray[i]);
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




