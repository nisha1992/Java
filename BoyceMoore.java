import java.io.*;
import java.util.*;
class BoyceMoore
{
public Hashtable<String,Integer> table=new Hashtable();
public static void main(String arg[])
{
Scanner in=new Scanner(System.in);
BoyceMoore obj=new BoyceMoore();
String given="",match="";
given=in.next();
match=in.next();
int m=0,n=0;
m=match.length();
n=given.length();

obj.makeTable(match,m);
System.out.println(obj.matchString(given,match,m,n));
}
public void makeTable(String b,int m)
{
for(int i=0;i<b.length();i++)
{
table.put(b.substring(i,i+1),i);
}
Set<String> keys=table.keySet();
for(String s:keys)
{
System.out.println(s+" "+table.get(s));
}
}

public int matchString(String given,String match,int m,int n)
{
int i=0,j,skip=0;
for(i=0;i<=n-m;i+=skip)
 {
 skip=0;
 for(j=m-1;j>=0;j--)
  {
  if(!(match.substring(j,j+1).equals(given.substring(i+j,i+j+1))))
   {
    if(table.containsKey(given.substring(i+j,i+j+1)))
      {
      Integer x=(Integer) table.get(given.substring(i+j,i+j+1));
      skip=x;
      break;
      }
      else
      {
      skip=match.length();
      break;
      }
    }
   }
 if(skip==0)
  return i;
 }
  
  return -1;
}

}
