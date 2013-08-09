import java.io.*;
import java.util.*;

class RobinKarp
{
public static char a[],b[];
public static int j,m,n,h=1,pathash=0,strhash=0;
public static int q=101,d=10;
public static void RobinKarpMatch(String given,String match)
{
n=given.length();
m=match.length();

a=given.toCharArray();
b=match.toCharArray();
for(int i=0;i<m-1;i++)
{
h=(h*d)%q;
System.out.println("h="+h);
}

for(int i=0;i<m;i++)
{
pathash=(pathash*d+b[i])%q;
strhash=(strhash*d+a[i])%q;
}

for(int i=0;i<=n-m;i++)
{
if(pathash==strhash)
{
for(j=0;j<m;j++)
{
if(b[j]!=a[i+j])
break;
}
if(j == m)
System.out.println("Match found at "+i+" index :)");
}
if(i<n-m)
strhash=(d*(strhash-(a[i]*h))+a[i+m])%q;
if(strhash<0)
strhash=strhash+q;
}

}

public static void main(String arg[])
{
String given="",match="";
Scanner in=new Scanner(System.in);
given=in.next();
match=in.next();
RobinKarpMatch(given,match);
}

}
