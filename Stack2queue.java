class Stack2queue
{
  public static void main(String arg[])
  {
    stackImp<Integer> o1=new stackImp();
    stackImp<Integer> o2=new stackImp();
    o1.push(1);
    o1.push(2);
    o1.push(3);
    o1.push(4);
    o1.push(5);
    o2.push(o1.pop());
    o2.push(o1.pop());
    o2.push(o1.pop());
    o2.push(o1.pop());
    o2.push(o1.pop());
    while(o2.getTop()!=null)
    {
      System.out.println(o2.pop());
    }
  }
}
