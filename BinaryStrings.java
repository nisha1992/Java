import java.util.*;
class BinaryStrings
{
public static int arr[];
public static int m;
public static void main(String arg[])
{
Scanner in=new Scanner(System.in);
int n;
System.out.println("Enter the bit size:");
n=in.nextInt();
m=n;
arr=new int[n];
Binary(n);
}

public static void Binary(int n)
{
if(n<1)
{
for(int i=0;i<m;i++)
System.out.print(arr[i]);
System.out.println();
}
else
{
arr[n-1]=0;
Binary(n-1);
arr[n-1]=1;
Binary(n-1);
}
} 
}
