import java.io.*;
class NumtoWord
{
public static int number,w,num,p;
public static String word[]={"one","two","three","four","five","six","seven","eight","nine","ten"};
public static String word1[]={"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
public static String word2[]={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
public static String word3[]={"hundred","thousand","lakh","crore"};
public static String str="";


public static void numbertoword(int n)
{
int ch=1;
while(n != 0)
{
switch(ch)
{
case 1:
num=n%100;
Change(num);
n = n/100;
break;


case 2:
num=n%10;
if(num !=0)
{
Display(word3[0]);
}
Change(num);
n = n/10;
break;

case 3:
num=n%100;
if(num !=0)
{
Display(word3[1]);
}
Change(num);
n = n/100;
break;

case 4:
num=n%100;
if(num !=0)
{
Display(word3[2]);
}
Change(num);
n =n/100;
break;

case 5:
num=n%100;
if(num !=0);
{
Display(word3[3]);
}
Change(num);
n=n/100;
break;

default:
System.exit(0);
}
ch++;
}
}

public static void Change(int p)
{
if(p<=10)
{
Display(word[p-1]);
}

if(p>10 && p<20)
{
Display(word1[p-10]);
}

if(p>19)
{
num=p%10;
if(num == 0)
{
num = p/10;
Display(word2[num-1]);
}
else
{
num=p%10;
Display(word[num-1]);
num=p/10;
Display(word2[num-2]);

}

}
}

public static void Display(String s)
{
str=s+"\t"+str;
}
public static void main(String arg[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number");
number=Integer.parseInt(br.readLine());
numbertoword(number);
System.out.println("number in words:");
System.out.println(str);
}
}
