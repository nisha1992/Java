import java.util.*;
public class TOH
{


public static void move(int N,stackImp<Integer> D,stackImp<Integer> E,stackImp<Integer> F)
{
if(N==0)
{
return;
}
else if(N==1)
{
F.push(D.pop());
}
else if(N >1)
{
move(N-1,D,F,E);
F.push(D.pop());
move(N-1,E,D,F);
}
}
public static void main(String arg[])
{
stackImp<Integer> A=new stackImp();
stackImp<Integer> B=new stackImp();
stackImp<Integer> C=new stackImp();
for(Integer i=10;i>0;i--)
{
A.push(i);
}
System.out.println("Stack A");
A.displayAll();
System.out.println("Stack B");
B.displayAll();
System.out.println("Stack C");
C.displayAll();

move(10,A,B,C);

}

}

