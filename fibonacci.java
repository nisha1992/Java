class fibonacci
{
static final int Maxindex = 15;
public static void main(String arg[])
{
int lo=1;
int hi=1;
int index=1;
System.out.println(index+":"+lo);
while(index<Maxindex)
{
index++;
if(hi%2 == 0)
{
System.out.println(index+":"+hi+"*");
}
else
{
System.out.println(index+":"+hi);
}
hi=lo+hi;
lo=hi-lo;
}
}
}

