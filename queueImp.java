class queueImp
{
public static void main(String arg[])
{
MyCQueue<Integer> o=new MyCQueue();
o.insert(2);
o.insert(9);
o.insert(21);
o.insert(23);
o.insert(56);
o.insert(57);
o.insert(58);
o.insert(59);
System.out.println("first");
o.displayAll();
o.delete();
System.out.println();
System.out.println("second");
o.displayAll();
o.delete();
o.delete();
o.delete();
o.delete();
System.out.println("after deletion");
o.displayAll();
}
}
