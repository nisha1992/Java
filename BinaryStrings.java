import java.util.*;
class strings
{
public static char arr[];
public static int m;
public static void main(String arg[])
{
Scanner in=new Scanner(System.in);
String given;
System.out.println("Enter the string:");
given=in.next();
m=given.length();
arr=given.toCharArray();
char a[]=new char[m];
Binary(m,a);
}

public static void Binary(int n,char a[])
{
int k=0;
if(n<1)
{
for(int i=0;i<m;i++)
System.out.print(a[i]);
System.out.println();
return;
}
else
{
for(int i=0;i<m;i++)
{
a[n-1]=arr[i];
Binary(n-1,a);
}
}
} 
}
