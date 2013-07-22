class singleton
{
private static singleton o=new singleton();
private singleton()
{

}
public static void sum(int a,int b)
{
int c;
c=a+b;
System.out.println(c);
}
public static singleton getInstance()
{
return o;
}

public static void main(String arg[])
{
getInstance().sum(4,7);
sum(4,7);
}
}

