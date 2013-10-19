class TrieNode
{
char l;
boolean flag;
TrieNode child[];
TrieNode()
{}


TrieNode(char letter,boolean word)
{
l=letter;
flag=word;
child=new TrieNode[26];
}

}

class Trie
{

static TrieNode create()
{
return(new TrieNode('\0',false));
}
public static void insert(TrieNode root,String str)
{
int offset=97;
int l=str.length();
char a[]=str.toCharArray();
TrieNode temp=root;
for(int i=0;i<l;i++)
{
if(temp.child[a[i]-offset]==null)
temp.child[a[i]-offset] = new TrieNode(a[i], i == l-1 ? true : false);
temp = temp.child[a[i]-offset];
}
}

public static void printWord(TrieNode root,int index,char a[])
{
if(root ==null)
return;

for(int i=0;i<root.child.length;i++)
{
a[index]=root.l;
printWord(root.child[i],index+1,a);
}
if(root.flag)
{
for(int j=1;j<=index;j++)
{
System.out.print(a[j]);
}
System.out.println();
}
}

public static void main(String arg[])
{
TrieNode tree=create();
String[] words = {"an","nisha","niks","jasso","priyanka"};
for (int i = 0; i < words.length; i++)
insert(tree, words[i]);
char b[]=new char[100];
printWord(tree,0,b);
}
}
