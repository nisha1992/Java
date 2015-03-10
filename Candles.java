import java.util.*;

class Candles
{

	public static void main(String ar[])
	{
	
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int counter = 0,j;
		TreeMap map = new TreeMap();
		TreeMap temp = new TreeMap();
		for(int i=0; i<n; i++)
		{
		
			int a = sc.nextInt();
			map.put(a,0);
		
		}
		
		System.out.println("hey");
		for(counter=0; counter<n; counter++)
		{
			
			NavigableSet set = map.descendingKeySet();
			Iterator i = set.iterator();
			System.out.println("counterloop");
			for(j=0; j<=counter; j++)
			{
				if(i.hasNext())
				{
					
					int r = (Integer)i.next();
					System.out.println(r);
					//if(r==0)
					//break;
					//System.out.println("r="+r);
					temp.put(r-1,0);
		
				}
			}
			//if(j != counter+1)
			//break;
			System.out.println("secmaptemp");
			NavigableSet set1 = temp.descendingKeySet();
			Iterator tmp = set1.iterator();
			while(tmp.hasNext())
			{	
				int k = (Integer)tmp.next();
				System.out.println(k);
				map.remove(k+1);
				map.put(k,0);	
			}
			temp.clear();
			NavigableSet set2 = map.descendingKeySet();
			Iterator tmp1 = set2.iterator();
			System.out.println("itrtempmapadd");
			while(tmp1.hasNext())
			{
				System.out.println(tmp1.next());	
			}
		}
		System.out.println("counter= "+counter);	
		
	}

}
