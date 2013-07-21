import java.io.*;
public class PLoop
{
public static void main (String[] args) throws IOException
{
int num,digit;
System.out.println("Enter number");
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
String s1=br.readLine();
num=Integer.parseInt(s1);

do
{
check(num);
num++;
if(check(num))
{
break;
}
}
while(!check(num));
System.out.println("The next Palindrome number is: "+num);
}



public static boolean check(int a)
{
int temp,rem,rev=0;
temp=a;
while(temp!=0)
{
rem=temp%10;
temp=temp/10;
rev=rev*10+rem;
}
if(a==rev)
return true;
else
return false;
}

 }

