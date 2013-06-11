import java.io.*;
class Palindrome
{
public static int number,count=0,x,y,z,o,newnum;

public static void main(String args[]) throws IOException     //Main Method
{
System.out.println("Enter a number");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
number=Integer.parseInt(br.readLine());
Length(number);
if(count%2 ==0)
{
Even(number,count);
}
else
{
Odd(number,count);
}
}


public static void Length(int l)     //to find the length of numeric string       
{
while(l>0)
{
l=l/10;
count++;
}
}


public static boolean Palindrome(int a)     //to check whether a number is palindrome or not
{
int temp,n,rev=0;
temp=a;
while(temp!=0)
{
n=temp%10;
temp=temp/10;
rev=(rev*10+n);
}
if(rev == a && a>number)
{
return true;

}
else
{
return false;
}
}

public static void Even(int num,int count)     //for numbers with even length
{
int m=(int)Math.pow(10,(count/2));
x=num/m;
y=num%m;
if(count ==2)
{
y=x;
newnum=x*m+y;
Palindrome(newnum);
if(!Palindrome(newnum))
{
x++;
z=rev(x);
newnum=x*m+z;
Palindrome(newnum);
}
}
else
{
z=rev(x);
newnum=x*m+z;
Palindrome(newnum);
if(!Palindrome(newnum))
{
x=newnum/m;
y=newnum%m;
x++;
z=rev(x);
newnum=x*m+z;
Palindrome(newnum);
}
}
System.out.println(newnum+" is the next palindrome no.");
}


public static void Odd(int num,int count)     //for numbers with odd length
{
int m=(int)Math.pow(10,(count/2));
int n=(int)Math.pow(10,((count/2)+1));
int x=num/m;
if(x%10 == 9)
{
x++;
int o=x/10;
z=rev(o);
newnum=x*m+z;
Palindrome(newnum);
}
else
{
y=num/n;
z=rev(y);
newnum=x*m+z;
Palindrome(newnum);
if(!Palindrome(newnum))
{
x++;
newnum=x*m+z;
Palindrome(newnum);
}
}
System.out.println(newnum+" is the next palindrome no.");
}


public static int rev(int r)     //reverse
{
int temp,n,rev=0;
temp=r;
while(temp!=0)
{
n=temp%10;
temp=temp/10;
rev=(rev*10+n);
}
return rev;
} 


}
