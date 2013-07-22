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

public class TreeIdentical
{

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
    return(isIdentical(root1.left,root2.left) && isIdentical( root1.right,root2.right));

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

public static void main(String arg[]) throws IOException
{
Node root1=null,root2=null;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int num,n;
System.out.println("Enter first tree:");
System.out.println("Enter the no. of nodes:");
n=Integer.parseInt(br.readLine());
if(root1==null)
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
printInOrder(root1);
System.out.println("Enter second tree:");
System.out.println("Enter the no. of nodes:");
n=Integer.parseInt(br.readLine());
if(root2==null)
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

if(isIdentical(root1,root2))
System.out.println("identical");
else
System.out.println("not identical");
}
}
