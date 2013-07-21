import java.io.*;
import java.lang.System;
import java.util.*;
class MyShell extends ShellImp    //class Myshell extends ShellImp
{
private static String home,pwd;
    
public void pwd()
{
System.out.println(home);
}


public void ls()     //list all files in a directory
{
File temp=new File(System.getProperty("user.dir"));
File list[]=temp.listFiles();
for(int i=0;i<list.length;i++)
System.out.println(list[i]);
}

public void cd()      //cd . home directory
{
home=System.getProperty("user.home");
}



public static void main(String arg[]) throws IOException    //main method
{
String console;
MyShell obj=new MyShell();
Scanner in=new Scanner(System.in);
home=(System.getProperty("user.home"));

while(true)
{
System.out.print("MyShell"+home+">");
console=in.nextLine();

if(console.equals(""))
continue;

if(console.equals("exit"))
System.exit(0);

if(console.equals("cd ."))
{
obj.cd();
continue;
}

if(console.equals("pwd"))
{
obj.pwd();
}

if(console.equals("ls"))
{
obj.ls();
continue;
}

String Divide[]=console.split(" ");
if(Divide[0].equals("cd"))
{
String argument=Divide[1];
File temp=new File(home+"/"+argument);
if(!temp.exists())
{
System.out.println("Error invalid Directory!!");
continue;
}
else
{
home=home+"/"+argument;
continue;
}
}

if(Divide[0].equals("find"))
{
String argument=Divide[1];
File temp=new File(argument);
String result=temp.getCanonicalPath();
System.out.println(result);
}
}
}
}
