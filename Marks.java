import java.util.Scanner;
import java.io.*;
public class Marks
{
int m=10;
String s="";
public static int temp,mod,div;
private String t026[]={"8"};
private String t1[]={"3","4","6","7","8","9"};
private String t347[]={"8","9"};
private String t5[]={"6","8","9"};

public void maxmarks(int max,int div,int mod)   //method to increment each digit
{
int i=0,len,save;
save=mod;
boolean flag=true;
switch(mod)
{

case 8:
case 9:
{
s=Integer.toString(save)+s;
break;
}
case 0:
case 2:
case 6:
{
len=t026.length-1;
while(len>=0)
{
mod=Integer.parseInt(t026[len]);
temp=div*m+Integer.parseInt(Integer.toString(mod)+s);
if(temp <max)
break;
else
len--;
}
if(len==-1)
{
s=Integer.toString(save)+s;
}
else
{
s=Integer.toString(mod)+s;
}
break;
}

case 1:
{
len=t1.length-1;
while(len>=0)
{
mod=Integer.parseInt(t1[len]);
temp=div*m+Integer.parseInt(Integer.toString(mod)+s);
if(temp <max)
break;
else
len--;
}
if(len==-1)
{
s=Integer.toString(save)+s;
}
else
{
s=Integer.toString(mod)+s;
}
break;
}


case 3:
case 4:
case 7:
{
len=t347.length-1;
while(len>=0)
{
mod=Integer.parseInt(t347[len]);
temp=div*m+Integer.parseInt(Integer.toString(mod)+s);
if(temp <max)
break;
else
len--;
}
if(len==-1)
{
s=Integer.toString(save)+s;
}
else
{
s=Integer.toString(mod)+s;
}
break;
}


case 5:
{
len=t5.length-1;
while(len>=0)
{
mod=Integer.parseInt(t5[len]);
temp=div*m+Integer.parseInt(Integer.toString(mod)+s);
if(temp <max)
break;
else
len--;
}
if(len==-1)
{
s=Integer.toString(save)+s;
}
else
{
s=Integer.toString(mod)+s;
}
break;
}

default:
{
System.out.println("end");
break;
}

}
}


public void Change(int num,int max)
{
div=num;
while(div>0)
{
mod=div%10;
div=div/10;
maxmarks(max,div,mod);
m=m*10;
}
if((max-Integer.parseInt(s))>(Math.pow(10,s.length())))
{
int r=max-Integer.parseInt(s);
int p=(int)Math.pow(10,s.length());
String a=Integer.toString((int)r/p);
s=a+s;
}
System.out.println(s);
}
}


class Check
{
public static void main(String arg[])throws IOException   //main method
{
int max,o;
Scanner in=new Scanner(System.in);
System.out.println("Enter the marks obtained and Max marks");
o=in.nextInt();
max=in.nextInt();
Marks obj=new Marks();
obj.Change(o,max);
}
}
