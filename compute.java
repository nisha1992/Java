import java.io.*;
import java.util.*;
import java.util.Scanner;

class ValueComparator implements Comparator 
{
    
    	Map base;
      	public ValueComparator(Map base) 
      	{
      	
      		this.base = base;
      	}

      	public int compare(Object a,Object b) 
      	{

        	if((Integer)base.get(a) > (Integer)base.get(b)) 
        	{
          		return 1;
        	} 
        	else if((Integer)base.get(a) == (Integer)base.get(b)) 
        	{
          		return 0;
        	} 
        	else 
        	{
          		return -1;
        	}
      	}
}

public class compute 
{
	private static ArrayList<String> strList  = new ArrayList<String>();
	private static void readInput() throws IOException
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0 ; i < n ; i++)
		{
			strList.add(in.next());
	    	}
	}    	
    	

  
	private static void printOutput(ArrayList<String> outputList)
	{
		for(int i = 0 ; i < outputList.size() ; i++)
		{
			if( i+1 == outputList.size())
	      		System.out.print(outputList.get(i));
	      		else
	      		{
	      			System.out.println(outputList.get(i));
	      		}
	    	}
	    	
	}

	  
	  /**
	  * Find Integers For Given Strings in decreasing order
	  *
	  * @param strList  : Array containing input strings.
	  * 
	  * return a list of string containg number and string in decresing order.
	  */
	private static ArrayList<String> findIntegerForGivenStrings(ArrayList<String> strList)
	{
	    /* Write your code here */
		HashMap strNumberMap = new HashMap();
		HashMap<String,Integer> output = new HashMap<String,Integer>();
		ValueComparator bvc =  new ValueComparator(output);
		TreeMap<String,Integer> sorted_map = new TreeMap(bvc);
		Iterator inputitr = strList.iterator();
		while(inputitr.hasNext())
		{
		    	
			String str = (String)inputitr.next();
		    	char arr[] = str.toCharArray();
		    	int o = 0;
		    	for(int i=0; i<arr.length; i++)
		    	{
		    		
		    		int val = arr[i]-'a';
		    		if(val==18 || val==21 || val==24 || val==25)
		    		o = o*10+(val/3-1+2);
		    		else
		    		o = o*10+(val/3+2);
		    	
		    	}
		    	output.put(str,o);
		    	
		}
		    
		sorted_map.putAll(output);
		ArrayList<String> finalOutput = new ArrayList<String>();
		NavigableSet set = sorted_map.descendingKeySet();
		Iterator i = set.iterator();
		while(i.hasNext())
		{
		    	
			String key = (String)i.next();
		    	finalOutput.add(key+" "+sorted_map.get(key));
		    
		}
	
		return finalOutput;

	}

	public static void main(String args[]) throws IOException 
	{

		readInput();
	  	printOutput(findIntegerForGivenStrings(strList));
	  
	}

}	
