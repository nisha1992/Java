import java.io.*;
import java.util.*;
class SpiralArray
{

 public void spiral(int a[][],int r,int s)
 {
 int k,l,m,n;
 k=0;
 l=0;
 m=r;
 n=s;
  while(k<m && l<s)
  {
   for(int i=l;i<n;i++)
   {  
   System.out.print(a[k][i]+" ");
   }
   k++;
   for(int i=k;i<m;i++)
   {
   System.out.print(a[i][n-1]+" ");
   }
   n--;
   for(int i=n-1;i>=l;i--)
   {
   System.out.print(a[m-1][i]+" ");
   }
   m--;
   for(int i=m-1;i>=k;i--)
   {
   System.out.print(a[i][l]+" ");
   }
   l++;
  }
 }
 
 public static void main(String arg[]) throws IOException
 {
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 SpiralArray obj=new SpiralArray();
 int rows,cols;
 System.out.println("Enter the array size:");
 System.out.println("rows:");
 rows=Integer.parseInt(br.readLine());
 System.out.println("cols:");
 cols=Integer.parseInt(br.readLine());
 System.out.println("Enter the array elements:");
 int a[][]=new int[rows][cols];
  for(int i=0;i<rows;i++)
  {
   for(int j=0;j<cols;j++)
   {
   a[i][j]=Integer.parseInt(br.readLine());
   }
  }
  System.out.println("Spiral array elements:");
  obj.spiral(a,rows,cols);
  System.out.println();
 }
}
