import java.util.*;
class InfixToPost
{
public static int checkPrecedence(char op)
{
switch(op)
{
case '+':
case '-':
return 0;
case '*':
case '/':
return 1;
case '^':
return 2;

}
}

public static int operation(char op,Integer x,Integer y)
{
switch(op)
{
case '+':
{
Integer sum = new Integer(x) + new Integer(y); 
return sum;
}

case '-':
{
Integer sum = new Integer(x) + new Integer(y); 
return sum;
}

case '*':
{
Integer sum = new Integer(x) + new Integer(y); 
return sum;
}

case '/':
{
Integer sum = new Integer(x) + new Integer(y); 
return sum;
}

default:
{
System.out.println("Invalid value");
return 0;
}

}
}


public static void main(String arg[])
{
char op[]={'*','/','-','+','^'};
Scanner in=new Scanner(System.in);
stackImp<String> stack1=new stackImp();
stackImp<String> stack2=new stackImp();
String s="";
System.out.println("Enter the expression:");
s=in.nextLine();
for(int i=0;i<s.length();i++)
{
if((Character.isDigit(s.charAt(i)))
stack1.push(Character.toString(s.charAt(i)));
else
{
if(stack2.getTop()==null)
{
stack2.push(Character.toString(s.charAt(i)));
}
String s=stack2.getTop();
if(checkPrecedence(s.charAt(0)) > checkPrecedence(s.charAt(i)))
{
stack2.push(Character.toString(s.charAt(i)));
}
else
{
do
{
String c=stack1.pop();
Integer a=(Integer) stack1.pop();
Integer b=(Integer) stack1.pop();
String ans=Integer.toString(operation(c.charAt(0),a,b));
stack1.push(ans);
}while(!(checkPrecedence(stack2.getTop())>checkPrecedence(s.substring(i,i+1))));
stack2.push(Character.toString(s.charAt(i)));
}
}
}
String c=stack1.pop();
int a=Integer.parseInt(stack1.pop());
int b=Integer.parseInt(stack1.pop());
String ans=Integer.toString(operation(c.charAt(i),a,b));
stack1.push(ans);
System.out.println(stack1.pop());
