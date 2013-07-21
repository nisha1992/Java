import java.io.*;
class Maths
{
protected static float number;

protected static void Round(float r)     //Round Value Method
{
int a=(int)r;
if(a<0)
{
if((r-a)*(-1) >=0.5)
{
a--;
}
}
else if(r-a >=0.5)
a++;

System.out.println("Rounded number is  "+a);
}

protected static void Ceil(float c)     //Ceiling Value Method
{
int a=(int)c;
if(a<0)
System.out.println("Ceiling value is  "+a);
else
System.out.println("Ceiling value is  "+(a+1)); 
} 

protected static void Floor(float f)     //Floor Value Method
{
int a=(int)f;
if(a<0)
System.out.println("Floor value is  "+(a-1));
else
System.out.println("Floor value is  "+a);
}

protected static void Log(int l)


public static void main(String arg[]) throws IOException   //Main Method
{
System.out.println("Enter a number");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
number=Float.parseFloat(br.readLine());
Round(number);
Ceil(number);
Floor(number);
}


}
