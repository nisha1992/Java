import java.io.*;
import java.util.*;
class Node
{
int data;
public Node left,right;
Node()
{} 
Node(int d)
{
data=d;
left=null;
right=null;
} 
}

public class TreeMirror
{

public static int printLevelOrder(Node aux)     //level order traversal
{
Node temp=aux;
int level=1;
MyQueue<Node> q=new MyQueue();
if(temp==null)
return 0;
else
{
q.insert(temp);
q.insert(null);
while(q.size()!=0)
{
temp=q.delete();
if(temp!=null)
{
System.out.print("Level:"+level);
System.out.println("\t"+temp.data);
}
if(temp==null)
{
if(q.size()!=0)
{
q.insert(null);
level++;
System.out.println();
}
}
else
{
if(temp.left!=null)
q.insert(temp.left);
if(temp.right!=null)
q.insert(temp.right);
}
}
}
return level;
}

public static void printInOrder(Node temp)       //print inorder
{
if (temp == null) 
{
return;
}
printInOrder(temp.left);
System.out.println("  Traversed " + temp.data);
printInOrder(temp.right);

}



public static boolean isIdentical(Node root1,Node root2)
{
    if( (root1==null && root2!=null) || (root2==null && root1!=null))
        return false;
   if(root1 == null && root2 == null)
        return true;
if(root1.data == root2.data)
    return(isIdentical(root1.left,root2.right) && isIdentical( root1.right,root2.left));

   return false;
}




public static void insertRec(Node temp,int num)   //insert by recursion
{
if(temp==null)
{
temp=new Node(num);
}
else
{
if(temp.data > num)
{
if(temp.left!=null)
insertRec(temp.left,num);
else
{
temp.left=new Node(num);
System.out.println("left="+temp.left.data);
}
}
else if(temp.data < num)
{
if(temp.right!=null)
insertRec(temp.right,num);
else
{
temp.right=new Node(num);
System.out.println("right="+temp.right.data);
}
}
}
}

public static void mirror(Node temp)
{
Node aux;
if(temp==null)
return;
else
{
mirror(temp.left);
mirror(temp.right);
aux=temp.left;
temp.left=temp.right;
temp.right=aux;
}
}

public static void main(String arg[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int num,n;
Node root1=null,root2=null;
System.out.println("Enter first tree:");
System.out.println("Enter the no. of nodes:");
n=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++)
{
System.out.println("enter the no. to insert");
num=Integer.parseInt(br.readLine());
if(root1==null)
{
root1=new Node(num);
}
else
insertRec(root1,num);
}

System.out.println("Enter second tree:");
System.out.println("Enter the no. of nodes:");
n=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++)
{
System.out.println("enter the no. to insert");
num=Integer.parseInt(br.readLine());
if(root2==null)
{
root2=new Node(num);
}
else
insertRec(root2,num);
}

System.out.println("before mirror image:");
System.out.println("level order of first");
printLevelOrder(root1);
System.out.println("level order of second");
printLevelOrder(root2);
if(isIdentical(root1,root2))
System.out.println("second tree is mirror of first tree :) ");
else
System.out.println("not a mirror :( ");

mirror(root2);
System.out.println("after mirror image:");
System.out.println("level order of first");
printLevelOrder(root1);
System.out.println("level order of second");
printLevelOrder(root2);
if(isIdentical(root1,root2))
System.out.println("second tree is mirror of first tree :) ");
else
System.out.println("not a mirror :( ");
}

}
