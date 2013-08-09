import java.util.*;
class strPermutations
{
public static char arr[];
public static boolean used[];
public static int m,count=0,index=0;
public static ArrayList<String> str;
public static void main(String arg[])
{
sorting sort=new sorting();
Scanner in=new Scanner(System.in);
String given;
System.out.println("Enter the string:");
given=in.next();
m=given.length();
arr=given.toCharArray();
char a[]=new char[m];
used=new boolean[m];
str=new ArrayList();
System.out.println("all permutations of a string:");
Binary(m,a);
sort.quickSort(str,0,(str.size()-1));
System.out.println("count="+count);
}

public static void Binary(int n,char a[])
{
int k=0;
String string="";
 if(n<1)
 {
 count++;
  for(int i=0;i<m;i++)
  {
  string=string+a[i];
   //System.out.print(a[i]);
  }
  str.add(string);
  return;
 }
 else
 {
 for(int i=0;i<m;i++)
 {
 if(used[i] )
 continue;
 if(i!=0)
 if(arr[i]==arr[i-1] && used[i-1])
 continue;
 a[n-1]=arr[i];
 used[i]=true;
 Binary(n-1,a);
 used[i]=false;
 }
 }
} 
}
