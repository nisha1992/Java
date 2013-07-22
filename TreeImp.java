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

public class TreeImp
{
static Node root=null,temp=null;

public void insert() throws IOException    //insert
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int num,n;
System.out.println("Enter the no. of nodes:");
n=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++)
{
System.out.println("enter the no. to insert");
num=Integer.parseInt(br.readLine());
insertRec(num);
}
}
public void insertRec(int num)   //insert by recursion
{
if(root==null)
{
root=new Node(num);
temp=root;
}
else
{
if(temp.data > num)
{
if(temp.left!=null)
{
temp=temp.left;
insertRec(num);
}
else
{
temp.left=new Node(num);
System.out.println("left="+temp.left.data);
}
}
else if(temp.data < num)
{
if(temp.right!=null)
{
temp=temp.right;
insertRec(num);
}
else
{
temp.right=new Node(num);
System.out.println("right="+temp.right.data);
}
}
}
}

public void inOrder()     //inorder traverse
{
printInOrder(root); 
}

public void postOrder()     //postorder traverse
{
printPostOrder(root); 
}

public void preOrder()     //preorder traverse
{
printPreOrder(root); 
}

public void printInOrder(Node temp)       //print inorder
{
if (temp == null) 
{
return;
}
printInOrder(temp.left);
System.out.println("  Traversed " + temp.data);
printInOrder(temp.right);

}

public void printPreOrder(Node temp)       //preorder traversal
{
if (temp != null) 
{

System.out.println("  Traversed " + temp.data);
printPreOrder(temp.left);
printPreOrder(temp.right);
}
}
 

public void printPostOrder(Node temp)       //postorder traversal
{
if (temp != null) 
{
printPostOrder(temp.left);
printPostOrder(temp.right);
System.out.println("  Traversed " + temp.data);
}
}


public void depth() //depth
{
findDepth(root);
}

public int findDepth(Node temp)    //find depth
{
int depth=0,ldepth,rdepth;
if(temp==null)
{
return depth;
}
ldepth=findDepth(temp.left);
rdepth=findDepth(temp.right);
if(ldepth>rdepth)
return ldepth+1;
else 
return rdepth+1;

}

public int printLevelOrder()     //level order traversal
{
Node temp=root;
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

public void min()   //min
{
findMin(root);
}

public void max()   //max
{
findMax(root);
}

public Node findMin(Node temp)    //find minimum
{
if(temp==null)
{
System.out.println("empty tree");
return null;
}
else if(temp.left==null)
{
System.out.println("min="+temp.data);
return temp;
}
else
{
return findMin(temp.left);
}
}


public Node findMax(Node temp)    //find maximum
{
if(temp==null)
{
System.out.println("empty tree");
return null;
}
else if(temp.right==null)
{
System.out.println("max="+temp.data);
return temp;
}
else
{
return findMax(temp.right);
}
}

/*public Node Search(Node temp,int element)    //search
{
if(temp==null)
return null;
if(temp.data == element)
{
System.out.println("Found");
return temp;
}
else if(element < temp.data)
return Search(temp.left,element);
else 
return Search(temp.right,element);
}



public void countLeaf(Node temp)        //count leaf nodes
{
MyQueue<Node> q=new MyQueue();
int count=0;
if(temp!=null)
{
q.insert(temp);
}
while(q.size()!=0)
{
Node m=(Node) q.delete();
if(m.left!=null)
q.insert(m.left);
if(m.right!=null)
q.insert(m.right);
if(m.left==null && m.right==null)
count++;
}
System.out.println("No. of leaf nodes="+count);
}

public Node delete(Node temp,int e)     //delete
{
Node t;
if(temp==null)
return null;
else if(temp.data > e)
temp.left=delete(temp.left,e);
else if(temp.data < e)
temp.right=delete(temp.right,e);
else if(temp.left==null && temp.right==null)
{
temp=null;
}
else
{
if(temp.left!=null && temp.right!=null)
{
t=findMax(temp.left);
temp.data=t.data;
temp.left=delete(temp.left,temp.data);
}
else
{
t=temp;
if(temp.left==null)
{
temp=temp.right;
t.right=null;
}
if(temp.right==null)
{
temp=temp.left;
t.left=null;
}
}
}
return temp;
}*/

public static void main(String arg[]) throws IOException
{
//Node root=null;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int op,num;


while(true)
{
System.out.println("1.Insert \n 2.Inorder traversal\n 3.preorder traversal\n 4.postorder traversal\n5.level traversal\n6.count leaf nodes \n 7.depth\n8.Search\n9.Delete\n10.find minimum\n11.find maximum\n12.identical\n");
System.out.println("enter the option");
op=Integer.parseInt(br.readLine());


switch(op)
{

case 1:
/*System.out.println("enter the no. to insert");
num=Integer.parseInt(br.readLine());
if(root==null)
root=new Node(num);*/
TreeImp t=new TreeImp();
t.insert();
break;

case 2:
TreeImp t1=new TreeImp();
t1.inOrder();
break;

case 3:
TreeImp t2=new TreeImp();
t2.preOrder();
break;

case 4:
TreeImp t3=new TreeImp();
t3.postOrder();
break;

case 5:
TreeImp t4=new TreeImp();
t4.printLevelOrder();
break;

/*case 6:
TreeImp t5=new TreeImp();
t5.countLeaf(root);
break;*/

case 7:
TreeImp t6=new TreeImp();
System.out.println("depth="+(t6.findDepth(root)-1));
break;

/*case 8:
System.out.println("enter the no. to search");
num=Integer.parseInt(br.readLine());
TreeImp t7=new TreeImp();
t7.Search(root,num);
break;

case 9:
System.out.println("enter the no. to delete");
num=Integer.parseInt(br.readLine());
TreeImp t8=new TreeImp();
t8.delete(root,num);
break;

case 10:
TreeImp t9=new TreeImp();
t9.findMin(root);
break;

case 11:
TreeImp t10=new TreeImp();
t10.findMax(root);
break;*/

default:System.exit(0); 
}
}
}
}















